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
package ai.certifai.util;

import lombok.extern.slf4j.Slf4j;

import java.io.File;

/**
 * @author codenamewei
 */
@Slf4j
public class FileLoader {

    public static File getOutputLoader(Class class_)
    {
        try
        {
            ClassLoader loader = class_.getClassLoader();

            String resourcePath = class_.getName().replace(".", "/");
            String resourceFile = resourcePath + "/" + Config.OUTPUT_FILE;

            return new File(loader.getResource(resourceFile).getFile());
        }
        catch(Exception e)
        {
            log.info("Error when reading input file: " + e.getMessage());
        }
        return null;
    }

    public static File getInputLoader(Class class_)
    {
        ClassLoader loader = class_.getClassLoader();

        String resourcePath = class_.getName().replace(".", "/");
        String resourceFile = resourcePath + "/" + Config.INPUT_FILE;

        return new File(loader.getResource(resourceFile).getFile());
    }

    public static File getInputLoader(Class class_, String fileName)
    {
        ClassLoader loader = class_.getClassLoader();

        String resourcePath = class_.getName().replace(".", "/");
        String resourceFile = resourcePath + "/" + fileName;

        return new File(loader.getResource(resourceFile).getFile());
    }
}
