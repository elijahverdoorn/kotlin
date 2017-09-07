/*
 * Copyright 2010-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.checkers;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/foreignAnnotations/tests")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class ForeignAnnotationsTestGenerated extends AbstractForeignAnnotationsTest {
    public void testAllFilesPresentInTests() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/foreignAnnotations/tests"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("android.kt")
    public void testAndroid() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/android.kt");
        doTest(fileName);
    }

    @TestMetadata("aosp.kt")
    public void testAosp() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/aosp.kt");
        doTest(fileName);
    }

    @TestMetadata("eclipse.kt")
    public void testEclipse() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/eclipse.kt");
        doTest(fileName);
    }

    @TestMetadata("findBugsSimple.kt")
    public void testFindBugsSimple() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/findBugsSimple.kt");
        doTest(fileName);
    }

    @TestMetadata("lombokSimple.kt")
    public void testLombokSimple() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/lombokSimple.kt");
        doTest(fileName);
    }

    @TestMetadata("rxjava.kt")
    public void testRxjava() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/rxjava.kt");
        doTest(fileName);
    }

    @TestMetadata("compiler/testData/foreignAnnotations/tests/jsr305")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Jsr305 extends AbstractForeignAnnotationsTest {
        public void testAllFilesPresentInJsr305() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/foreignAnnotations/tests/jsr305"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("nonNullNever.kt")
        public void testNonNullNever() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305/nonNullNever.kt");
            doTest(fileName);
        }

        @TestMetadata("nullabilityNicknames.kt")
        public void testNullabilityNicknames() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305/nullabilityNicknames.kt");
            doTest(fileName);
        }

        @TestMetadata("simple.kt")
        public void testSimple() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305/simple.kt");
            doTest(fileName);
        }

        @TestMetadata("strange.kt")
        public void testStrange() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305/strange.kt");
            doTest(fileName);
        }

        @TestMetadata("compiler/testData/foreignAnnotations/tests/jsr305/ignore")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class Ignore extends AbstractForeignAnnotationsTest {
            public void testAllFilesPresentInIgnore() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/foreignAnnotations/tests/jsr305/ignore"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
            }

            @TestMetadata("parametersAreNonnullByDefault.kt")
            public void testParametersAreNonnullByDefault() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305/ignore/parametersAreNonnullByDefault.kt");
                doTest(fileName);
            }
        }

        @TestMetadata("compiler/testData/foreignAnnotations/tests/jsr305/nullabilityWarnings")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class NullabilityWarnings extends AbstractForeignAnnotationsTest {
            public void testAllFilesPresentInNullabilityWarnings() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/foreignAnnotations/tests/jsr305/nullabilityWarnings"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
            }

            @TestMetadata("nullabilityGenerics.kt")
            public void testNullabilityGenerics() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305/nullabilityWarnings/nullabilityGenerics.kt");
                doTest(fileName);
            }

            @TestMetadata("nullabilityNicknames.kt")
            public void testNullabilityNicknames() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305/nullabilityWarnings/nullabilityNicknames.kt");
                doTest(fileName);
            }

            @TestMetadata("simple.kt")
            public void testSimple() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305/nullabilityWarnings/simple.kt");
                doTest(fileName);
            }

            @TestMetadata("strange.kt")
            public void testStrange() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305/nullabilityWarnings/strange.kt");
                doTest(fileName);
            }

            @TestMetadata("compiler/testData/foreignAnnotations/tests/jsr305/nullabilityWarnings/fromPlatformTypes")
            @TestDataPath("$PROJECT_ROOT")
            @RunWith(JUnit3RunnerWithInners.class)
            public static class FromPlatformTypes extends AbstractForeignAnnotationsTest {
                public void testAllFilesPresentInFromPlatformTypes() throws Exception {
                    KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/foreignAnnotations/tests/jsr305/nullabilityWarnings/fromPlatformTypes"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
                }

                @TestMetadata("arithmetic.kt")
                public void testArithmetic() throws Exception {
                    String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305/nullabilityWarnings/fromPlatformTypes/arithmetic.kt");
                    doTest(fileName);
                }

                @TestMetadata("array.kt")
                public void testArray() throws Exception {
                    String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305/nullabilityWarnings/fromPlatformTypes/array.kt");
                    doTest(fileName);
                }

                @TestMetadata("assignToVar.kt")
                public void testAssignToVar() throws Exception {
                    String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305/nullabilityWarnings/fromPlatformTypes/assignToVar.kt");
                    doTest(fileName);
                }

                @TestMetadata("conditions.kt")
                public void testConditions() throws Exception {
                    String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305/nullabilityWarnings/fromPlatformTypes/conditions.kt");
                    doTest(fileName);
                }

                @TestMetadata("dataFlowInfo.kt")
                public void testDataFlowInfo() throws Exception {
                    String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305/nullabilityWarnings/fromPlatformTypes/dataFlowInfo.kt");
                    doTest(fileName);
                }

                @TestMetadata("defaultParameters.kt")
                public void testDefaultParameters() throws Exception {
                    String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305/nullabilityWarnings/fromPlatformTypes/defaultParameters.kt");
                    doTest(fileName);
                }

                @TestMetadata("delegatedProperties.kt")
                public void testDelegatedProperties() throws Exception {
                    String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305/nullabilityWarnings/fromPlatformTypes/delegatedProperties.kt");
                    doTest(fileName);
                }

                @TestMetadata("delegation.kt")
                public void testDelegation() throws Exception {
                    String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305/nullabilityWarnings/fromPlatformTypes/delegation.kt");
                    doTest(fileName);
                }

                @TestMetadata("derefenceExtension.kt")
                public void testDerefenceExtension() throws Exception {
                    String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305/nullabilityWarnings/fromPlatformTypes/derefenceExtension.kt");
                    doTest(fileName);
                }

                @TestMetadata("derefenceMember.kt")
                public void testDerefenceMember() throws Exception {
                    String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305/nullabilityWarnings/fromPlatformTypes/derefenceMember.kt");
                    doTest(fileName);
                }

                @TestMetadata("expectedType.kt")
                public void testExpectedType() throws Exception {
                    String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305/nullabilityWarnings/fromPlatformTypes/expectedType.kt");
                    doTest(fileName);
                }

                @TestMetadata("for.kt")
                public void testFor() throws Exception {
                    String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305/nullabilityWarnings/fromPlatformTypes/for.kt");
                    doTest(fileName);
                }

                @TestMetadata("functionArguments.kt")
                public void testFunctionArguments() throws Exception {
                    String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305/nullabilityWarnings/fromPlatformTypes/functionArguments.kt");
                    doTest(fileName);
                }

                @TestMetadata("invoke.kt")
                public void testInvoke() throws Exception {
                    String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305/nullabilityWarnings/fromPlatformTypes/invoke.kt");
                    doTest(fileName);
                }

                @TestMetadata("kt6829.kt")
                public void testKt6829() throws Exception {
                    String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305/nullabilityWarnings/fromPlatformTypes/kt6829.kt");
                    doTest(fileName);
                }

                @TestMetadata("multiDeclaration.kt")
                public void testMultiDeclaration() throws Exception {
                    String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305/nullabilityWarnings/fromPlatformTypes/multiDeclaration.kt");
                    doTest(fileName);
                }

                @TestMetadata("passToJava.kt")
                public void testPassToJava() throws Exception {
                    String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305/nullabilityWarnings/fromPlatformTypes/passToJava.kt");
                    doTest(fileName);
                }

                @TestMetadata("primitiveArray.kt")
                public void testPrimitiveArray() throws Exception {
                    String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305/nullabilityWarnings/fromPlatformTypes/primitiveArray.kt");
                    doTest(fileName);
                }

                @TestMetadata("throw.kt")
                public void testThrow() throws Exception {
                    String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305/nullabilityWarnings/fromPlatformTypes/throw.kt");
                    doTest(fileName);
                }

                @TestMetadata("uselessElvisRightIsNull.kt")
                public void testUselessElvisRightIsNull() throws Exception {
                    String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305/nullabilityWarnings/fromPlatformTypes/uselessElvisRightIsNull.kt");
                    doTest(fileName);
                }
            }

            @TestMetadata("compiler/testData/foreignAnnotations/tests/jsr305/nullabilityWarnings/typeQualifierDefault")
            @TestDataPath("$PROJECT_ROOT")
            @RunWith(JUnit3RunnerWithInners.class)
            public static class TypeQualifierDefault extends AbstractForeignAnnotationsTest {
                public void testAllFilesPresentInTypeQualifierDefault() throws Exception {
                    KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/foreignAnnotations/tests/jsr305/nullabilityWarnings/typeQualifierDefault"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
                }

                @TestMetadata("fieldsAreNullable.kt")
                public void testFieldsAreNullable() throws Exception {
                    String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305/nullabilityWarnings/typeQualifierDefault/fieldsAreNullable.kt");
                    doTest(fileName);
                }

                @TestMetadata("nullabilityFromOverridden.kt")
                public void testNullabilityFromOverridden() throws Exception {
                    String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305/nullabilityWarnings/typeQualifierDefault/nullabilityFromOverridden.kt");
                    doTest(fileName);
                }

                @TestMetadata("overridingDefaultQualifier.kt")
                public void testOverridingDefaultQualifier() throws Exception {
                    String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305/nullabilityWarnings/typeQualifierDefault/overridingDefaultQualifier.kt");
                    doTest(fileName);
                }

                @TestMetadata("parametersAreNonnullByDefault.kt")
                public void testParametersAreNonnullByDefault() throws Exception {
                    String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305/nullabilityWarnings/typeQualifierDefault/parametersAreNonnullByDefault.kt");
                    doTest(fileName);
                }

                @TestMetadata("parametersAreNonnullByDefaultPackage.kt")
                public void testParametersAreNonnullByDefaultPackage() throws Exception {
                    String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305/nullabilityWarnings/typeQualifierDefault/parametersAreNonnullByDefaultPackage.kt");
                    doTest(fileName);
                }

                @TestMetadata("springNullable.kt")
                public void testSpringNullable() throws Exception {
                    String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305/nullabilityWarnings/typeQualifierDefault/springNullable.kt");
                    doTest(fileName);
                }

                @TestMetadata("springNullablePackage.kt")
                public void testSpringNullablePackage() throws Exception {
                    String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305/nullabilityWarnings/typeQualifierDefault/springNullablePackage.kt");
                    doTest(fileName);
                }
            }
        }

        @TestMetadata("compiler/testData/foreignAnnotations/tests/jsr305/typeQualifierDefault")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class TypeQualifierDefault extends AbstractForeignAnnotationsTest {
            public void testAllFilesPresentInTypeQualifierDefault() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/foreignAnnotations/tests/jsr305/typeQualifierDefault"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
            }

            @TestMetadata("fieldsAreNullable.kt")
            public void testFieldsAreNullable() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305/typeQualifierDefault/fieldsAreNullable.kt");
                doTest(fileName);
            }

            @TestMetadata("forceFlexibility.kt")
            public void testForceFlexibility() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305/typeQualifierDefault/forceFlexibility.kt");
                doTest(fileName);
            }

            @TestMetadata("forceFlexibleOverOverrides.kt")
            public void testForceFlexibleOverOverrides() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305/typeQualifierDefault/forceFlexibleOverOverrides.kt");
                doTest(fileName);
            }

            @TestMetadata("nullabilityFromOverridden.kt")
            public void testNullabilityFromOverridden() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305/typeQualifierDefault/nullabilityFromOverridden.kt");
                doTest(fileName);
            }

            @TestMetadata("overridingDefaultQualifier.kt")
            public void testOverridingDefaultQualifier() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305/typeQualifierDefault/overridingDefaultQualifier.kt");
                doTest(fileName);
            }

            @TestMetadata("parametersAreNonnullByDefault.kt")
            public void testParametersAreNonnullByDefault() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305/typeQualifierDefault/parametersAreNonnullByDefault.kt");
                doTest(fileName);
            }

            @TestMetadata("parametersAreNonnullByDefaultPackage.kt")
            public void testParametersAreNonnullByDefaultPackage() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305/typeQualifierDefault/parametersAreNonnullByDefaultPackage.kt");
                doTest(fileName);
            }

            @TestMetadata("springNullable.kt")
            public void testSpringNullable() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305/typeQualifierDefault/springNullable.kt");
                doTest(fileName);
            }

            @TestMetadata("springNullablePackage.kt")
            public void testSpringNullablePackage() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305/typeQualifierDefault/springNullablePackage.kt");
                doTest(fileName);
            }
        }
    }
}
