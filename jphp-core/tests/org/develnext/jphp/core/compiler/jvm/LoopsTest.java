package org.develnext.jphp.core.compiler.jvm;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.MethodSorters;
import php.runtime.Memory;

@RunWith(JUnit4.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoopsTest extends JvmCompilerCase {
    @Test
    public void testWhile(){
        Memory memory = includeResource("loops/while.php");
        Assert.assertEquals("success", memory.toString());
    }

    @Test
    public void testFor(){
        Memory memory = includeResource("loops/for.php");
        Assert.assertEquals("success", memory.toString());
    }

    @Test
    public void testDoWhile(){
        Memory memory = includeResource("loops/do_while.php");
        Assert.assertEquals("AAAAAAAAA", memory.toString());
    }

    @Test
    public void testForeach(){
        Memory memory = includeResource("loops/foreach.php");
        Assert.assertEquals("success", memory.toString());
    }
}
