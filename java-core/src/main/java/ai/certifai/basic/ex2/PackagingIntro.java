/*
 * Copyright (c) 2020 CertifAI Sdn. Bhd.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Apache License, Version 2.0 which is available at
 * https://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package ai.certifai.basic.ex2;

import ai.certifai.util.OutputParser;

/**
 * A thorough definition about the idea of Package in java
 *
 * @author codenamewei
 */
public class PackagingIntro
{
    static OutputParser out;

    public static void main(String[] args)
    {
        out = new OutputParser(PackagingIntro.class);

        /**
         Enter your code here
         Complete the program by making changes to line 38
         Tips: change the content assign to variable packageName
         **/
        String packageName = "ai.certifai.basic.ex2.PackagingIntro";
        String output = "Package Name = " + packageName;

        out.evaluate(output);
        System.out.println(output);

        out.printResult();
    }
}
