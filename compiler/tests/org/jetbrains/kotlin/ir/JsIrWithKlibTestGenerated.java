/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.ir;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/ir/interpreter")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class JsIrWithKlibTestGenerated extends AbstractJsIrWithKlibTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("abstract1.kt")
    public void testAbstract1() throws Exception {
        runTest("compiler/testData/ir/interpreter/abstract1.kt");
    }

    @TestMetadata("abstract2.kt")
    public void testAbstract2() throws Exception {
        runTest("compiler/testData/ir/interpreter/abstract2.kt");
    }

    @TestMetadata("abstract3.kt")
    public void testAbstract3() throws Exception {
        runTest("compiler/testData/ir/interpreter/abstract3.kt");
    }

    @TestMetadata("abstract4.kt")
    public void testAbstract4() throws Exception {
        runTest("compiler/testData/ir/interpreter/abstract4.kt");
    }

    public void testAllFilesPresentInInterpreter() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/ir/interpreter"), Pattern.compile("^(.+)\\.kt(s)?$"), null, true);
    }

    @TestMetadata("arrayConstructor.kt")
    public void testArrayConstructor() throws Exception {
        runTest("compiler/testData/ir/interpreter/arrayConstructor.kt");
    }

    @TestMetadata("arrayOf.kt")
    public void testArrayOf() throws Exception {
        runTest("compiler/testData/ir/interpreter/arrayOf.kt");
    }

    @TestMetadata("branches.kt")
    public void testBranches() throws Exception {
        runTest("compiler/testData/ir/interpreter/branches.kt");
    }

    @TestMetadata("companionOverride.kt")
    public void testCompanionOverride() throws Exception {
        runTest("compiler/testData/ir/interpreter/companionOverride.kt");
    }

    @TestMetadata("complexReturn.kt")
    public void testComplexReturn() throws Exception {
        runTest("compiler/testData/ir/interpreter/complexReturn.kt");
    }

    @TestMetadata("composition.kt")
    public void testComposition() throws Exception {
        runTest("compiler/testData/ir/interpreter/composition.kt");
    }

    @TestMetadata("copyReceivedValue.kt")
    public void testCopyReceivedValue() throws Exception {
        runTest("compiler/testData/ir/interpreter/copyReceivedValue.kt");
    }

    @TestMetadata("dataClass.kt")
    public void testDataClass() throws Exception {
        runTest("compiler/testData/ir/interpreter/dataClass.kt");
    }

    @TestMetadata("defaultArgs.kt")
    public void testDefaultArgs() throws Exception {
        runTest("compiler/testData/ir/interpreter/defaultArgs.kt");
    }

    @TestMetadata("defaultEquals.kt")
    public void testDefaultEquals() throws Exception {
        runTest("compiler/testData/ir/interpreter/defaultEquals.kt");
    }

    @TestMetadata("defaultHashCode.kt")
    public void testDefaultHashCode() throws Exception {
        runTest("compiler/testData/ir/interpreter/defaultHashCode.kt");
    }

    @TestMetadata("defaultToString.kt")
    public void testDefaultToString() throws Exception {
        runTest("compiler/testData/ir/interpreter/defaultToString.kt");
    }

    @TestMetadata("doWhileLoop.kt")
    public void testDoWhileLoop() throws Exception {
        runTest("compiler/testData/ir/interpreter/doWhileLoop.kt");
    }

    @TestMetadata("elvis.kt")
    public void testElvis() throws Exception {
        runTest("compiler/testData/ir/interpreter/elvis.kt");
    }

    @TestMetadata("enums1.kt")
    public void testEnums1() throws Exception {
        runTest("compiler/testData/ir/interpreter/enums1.kt");
    }

    @TestMetadata("enums2.kt")
    public void testEnums2() throws Exception {
        runTest("compiler/testData/ir/interpreter/enums2.kt");
    }

    @TestMetadata("enums3.kt")
    public void testEnums3() throws Exception {
        runTest("compiler/testData/ir/interpreter/enums3.kt");
    }

    @TestMetadata("extensionReceiver.kt")
    public void testExtensionReceiver() throws Exception {
        runTest("compiler/testData/ir/interpreter/extensionReceiver.kt");
    }

    @TestMetadata("fib.kt")
    public void testFib() throws Exception {
        runTest("compiler/testData/ir/interpreter/fib.kt");
    }

    @TestMetadata("inKeyword.kt")
    public void testInKeyword() throws Exception {
        runTest("compiler/testData/ir/interpreter/inKeyword.kt");
    }

    @TestMetadata("inlineReturn.kt")
    public void testInlineReturn() throws Exception {
        runTest("compiler/testData/ir/interpreter/inlineReturn.kt");
    }

    @TestMetadata("instanceOf.kt")
    public void testInstanceOf() throws Exception {
        runTest("compiler/testData/ir/interpreter/instanceOf.kt");
    }

    @TestMetadata("intMethods.kt")
    public void testIntMethods() throws Exception {
        runTest("compiler/testData/ir/interpreter/intMethods.kt");
    }

    @TestMetadata("interface.kt")
    public void testInterface() throws Exception {
        runTest("compiler/testData/ir/interpreter/interface.kt");
    }

    @TestMetadata("interfaceDefault.kt")
    public void testInterfaceDefault() throws Exception {
        runTest("compiler/testData/ir/interpreter/interfaceDefault.kt");
    }

    @TestMetadata("jsChar.kt")
    public void testJsChar() throws Exception {
        runTest("compiler/testData/ir/interpreter/jsChar.kt");
    }

    @TestMetadata("jsLong.kt")
    public void testJsLong() throws Exception {
        runTest("compiler/testData/ir/interpreter/jsLong.kt");
    }

    @TestMetadata("lambda.kt")
    public void testLambda() throws Exception {
        runTest("compiler/testData/ir/interpreter/lambda.kt");
    }

    @TestMetadata("listOf.kt")
    public void testListOf() throws Exception {
        runTest("compiler/testData/ir/interpreter/listOf.kt");
    }

    @TestMetadata("localFunction.kt")
    public void testLocalFunction() throws Exception {
        runTest("compiler/testData/ir/interpreter/localFunction.kt");
    }

    @TestMetadata("localObject.kt")
    public void testLocalObject() throws Exception {
        runTest("compiler/testData/ir/interpreter/localObject.kt");
    }

    @TestMetadata("loop.kt")
    public void testLoop() throws Exception {
        runTest("compiler/testData/ir/interpreter/loop.kt");
    }

    @TestMetadata("multipleOverridden.kt")
    public void testMultipleOverridden() throws Exception {
        runTest("compiler/testData/ir/interpreter/multipleOverridden.kt");
    }

    @TestMetadata("mutableListOf.kt")
    public void testMutableListOf() throws Exception {
        runTest("compiler/testData/ir/interpreter/mutableListOf.kt");
    }

    @TestMetadata("object.kt")
    public void testObject() throws Exception {
        runTest("compiler/testData/ir/interpreter/object.kt");
    }

    @TestMetadata("objectOverride.kt")
    public void testObjectOverride() throws Exception {
        runTest("compiler/testData/ir/interpreter/objectOverride.kt");
    }

    @TestMetadata("overrideDifferentName.kt")
    public void testOverrideDifferentName() throws Exception {
        runTest("compiler/testData/ir/interpreter/overrideDifferentName.kt");
    }

    @TestMetadata("progressionFromClosedRange.kt")
    public void testProgressionFromClosedRange() throws Exception {
        runTest("compiler/testData/ir/interpreter/progressionFromClosedRange.kt");
    }

    @TestMetadata("rangeTo.kt")
    public void testRangeTo() throws Exception {
        runTest("compiler/testData/ir/interpreter/rangeTo.kt");
    }

    @TestMetadata("regex.kt")
    public void testRegex() throws Exception {
        runTest("compiler/testData/ir/interpreter/regex.kt");
    }

    @TestMetadata("scopeFunctions.kt")
    public void testScopeFunctions() throws Exception {
        runTest("compiler/testData/ir/interpreter/scopeFunctions.kt");
    }

    @TestMetadata("secondaryConstructor.kt")
    public void testSecondaryConstructor() throws Exception {
        runTest("compiler/testData/ir/interpreter/secondaryConstructor.kt");
    }

    @TestMetadata("sequenceOf.kt")
    public void testSequenceOf() throws Exception {
        runTest("compiler/testData/ir/interpreter/sequenceOf.kt");
    }

    @TestMetadata("spreadOperator.kt")
    public void testSpreadOperator() throws Exception {
        runTest("compiler/testData/ir/interpreter/spreadOperator.kt");
    }

    @TestMetadata("stringBuilder.kt")
    public void testStringBuilder() throws Exception {
        runTest("compiler/testData/ir/interpreter/stringBuilder.kt");
    }

    @TestMetadata("stringConcatenation.kt")
    public void testStringConcatenation() throws Exception {
        runTest("compiler/testData/ir/interpreter/stringConcatenation.kt");
    }

    @TestMetadata("superClass.kt")
    public void testSuperClass() throws Exception {
        runTest("compiler/testData/ir/interpreter/superClass.kt");
    }

    @TestMetadata("trim.kt")
    public void testTrim() throws Exception {
        runTest("compiler/testData/ir/interpreter/trim.kt");
    }

    @TestMetadata("uInt.kt")
    public void testUInt() throws Exception {
        runTest("compiler/testData/ir/interpreter/uInt.kt");
    }

    @TestMetadata("vararg.kt")
    public void testVararg() throws Exception {
        runTest("compiler/testData/ir/interpreter/vararg.kt");
    }

    @TestMetadata("variableShadowing.kt")
    public void testVariableShadowing() throws Exception {
        runTest("compiler/testData/ir/interpreter/variableShadowing.kt");
    }

    @TestMetadata("variables.kt")
    public void testVariables() throws Exception {
        runTest("compiler/testData/ir/interpreter/variables.kt");
    }

    @TestMetadata("withReceivers.kt")
    public void testWithReceivers() throws Exception {
        runTest("compiler/testData/ir/interpreter/withReceivers.kt");
    }

    @TestMetadata("compiler/testData/ir/interpreter/exceptions")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Exceptions extends AbstractJsIrWithKlibTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInExceptions() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/ir/interpreter/exceptions"), Pattern.compile("^(.+)\\.kt(s)?$"), null, true);
        }

        @TestMetadata("arithmeticExceptionThrow.kt")
        public void testArithmeticExceptionThrow() throws Exception {
            runTest("compiler/testData/ir/interpreter/exceptions/arithmeticExceptionThrow.kt");
        }

        @TestMetadata("arithmeticExceptionTryBlock.kt")
        public void testArithmeticExceptionTryBlock() throws Exception {
            runTest("compiler/testData/ir/interpreter/exceptions/arithmeticExceptionTryBlock.kt");
        }

        @TestMetadata("arithmeticExceptionTryCatchFinally.kt")
        public void testArithmeticExceptionTryCatchFinally() throws Exception {
            runTest("compiler/testData/ir/interpreter/exceptions/arithmeticExceptionTryCatchFinally.kt");
        }

        @TestMetadata("classCastException.kt")
        public void testClassCastException() throws Exception {
            runTest("compiler/testData/ir/interpreter/exceptions/classCastException.kt");
        }

        @TestMetadata("commandsOutException.kt")
        public void testCommandsOutException() throws Exception {
            runTest("compiler/testData/ir/interpreter/exceptions/commandsOutException.kt");
        }

        @TestMetadata("divideByZero.kt")
        public void testDivideByZero() throws Exception {
            runTest("compiler/testData/ir/interpreter/exceptions/divideByZero.kt");
        }

        @TestMetadata("exceptionFromWrapper.kt")
        public void testExceptionFromWrapper() throws Exception {
            runTest("compiler/testData/ir/interpreter/exceptions/exceptionFromWrapper.kt");
        }

        @TestMetadata("exceptionWithCause.kt")
        public void testExceptionWithCause() throws Exception {
            runTest("compiler/testData/ir/interpreter/exceptions/exceptionWithCause.kt");
        }

        @TestMetadata("getCauseMessage.kt")
        public void testGetCauseMessage() throws Exception {
            runTest("compiler/testData/ir/interpreter/exceptions/getCauseMessage.kt");
        }

        @TestMetadata("multifileStackTrace.kt")
        public void testMultifileStackTrace() throws Exception {
            runTest("compiler/testData/ir/interpreter/exceptions/multifileStackTrace.kt");
        }

        @TestMetadata("nullPointerException.kt")
        public void testNullPointerException() throws Exception {
            runTest("compiler/testData/ir/interpreter/exceptions/nullPointerException.kt");
        }

        @TestMetadata("stackOverflow.kt")
        public void testStackOverflow() throws Exception {
            runTest("compiler/testData/ir/interpreter/exceptions/stackOverflow.kt");
        }

        @TestMetadata("stackTrace.kt")
        public void testStackTrace() throws Exception {
            runTest("compiler/testData/ir/interpreter/exceptions/stackTrace.kt");
        }

        @TestMetadata("tryFinally.kt")
        public void testTryFinally() throws Exception {
            runTest("compiler/testData/ir/interpreter/exceptions/tryFinally.kt");
        }
    }

    @TestMetadata("compiler/testData/ir/interpreter/generatedStdlib")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class GeneratedStdlib extends AbstractJsIrWithKlibTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInGeneratedStdlib() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/ir/interpreter/generatedStdlib"), Pattern.compile("^(.+)\\.kt(s)?$"), null, true);
        }

        @TestMetadata("contains.kt")
        public void testContains() throws Exception {
            runTest("compiler/testData/ir/interpreter/generatedStdlib/contains.kt");
        }

        @TestMetadata("elementAtOrElse.kt")
        public void testElementAtOrElse() throws Exception {
            runTest("compiler/testData/ir/interpreter/generatedStdlib/elementAtOrElse.kt");
        }

        @TestMetadata("first.kt")
        public void testFirst() throws Exception {
            runTest("compiler/testData/ir/interpreter/generatedStdlib/first.kt");
        }

        @TestMetadata("joinToString.kt")
        public void testJoinToString() throws Exception {
            runTest("compiler/testData/ir/interpreter/generatedStdlib/joinToString.kt");
        }
    }

    @TestMetadata("compiler/testData/ir/interpreter/collections")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Collections extends AbstractJsIrWithKlibTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("setOf.kt")
        public void testSetOf() throws Exception {
            runTest("compiler/testData/ir/interpreter/collections/setOf.kt");
        }

        @TestMetadata("mutableSetOf.kt")
        public void testMutableSetOf() throws Exception {
            runTest("compiler/testData/ir/interpreter/collections/mutableSetOf.kt");
        }

        @TestMetadata("mapOf.kt")
        public void testMapOf() throws Exception {
            runTest("compiler/testData/ir/interpreter/collections/mapOf.kt");
        }

        @TestMetadata("mutableMapOf.kt")
        public void testMutableMapOf() throws Exception {
            runTest("compiler/testData/ir/interpreter/collections/mutableMapOf.kt");
        }
    }
}
