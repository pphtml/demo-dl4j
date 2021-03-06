package org.dml.examples.ex01;

import org.datavec.api.records.reader.RecordReader;
import org.datavec.api.records.reader.impl.csv.CSVRecordReader;
import org.datavec.api.split.FileSplit;
import org.datavec.api.util.ClassPathResource;
import org.deeplearning4j.datasets.datavec.RecordReaderDataSetIterator;
import org.deeplearning4j.eval.Evaluation;
import org.deeplearning4j.nn.conf.MultiLayerConfiguration;
import org.deeplearning4j.nn.conf.NeuralNetConfiguration;
import org.deeplearning4j.nn.conf.layers.DenseLayer;
import org.deeplearning4j.nn.conf.layers.OutputLayer;
import org.deeplearning4j.nn.multilayer.MultiLayerNetwork;
import org.deeplearning4j.nn.weights.WeightInit;
import org.flexdata.csv.DataReader;
import org.flexdata.csv.Resource;
import org.nd4j.linalg.activations.Activation;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.dataset.DataSet;
import org.nd4j.linalg.dataset.SplitTestAndTrain;
import org.nd4j.linalg.dataset.api.iterator.DataSetIterator;
import org.nd4j.linalg.dataset.api.preprocessor.DataNormalization;
import org.nd4j.linalg.dataset.api.preprocessor.NormalizerStandardize;
import org.nd4j.linalg.lossfunctions.LossFunctions;
import org.superbiz.util.LoggingConfig;

import java.util.logging.Logger;

import static org.flexdata.csv.CSVReader.CSVReaderBuilder.createCSVReader;

public class Ex01 {
    static {
        System.setProperty("java.util.logging.config.class", LoggingConfig.class.getName());
    }

    private static final Logger LOGGER = Logger.getLogger(org.superbiz.dl4j.ex01.HelloDL4J.class.getName());

    private static final int FEATURES_COUNT = 4;
    private static final int CLASSES_COUNT = 3;

    public static void main(String[] args) {
        try (DataReader dataReader = createCSVReader()
                .withSkipLines(1)
                .withResource(Resource.fromClasspath("iris.txt"))
                .build()) {
//            DataSet allData = dataReader.getDataSet();
//
//            DataNormalization normalizer = new NormalizerStandardize();
//            normalizer.fit(allData);
//            normalizer.transform(allData);
//
//            SplitTestAndTrain testAndTrain = allData.splitTestAndTrain(0.65);
//            DataSet trainingData = testAndTrain.getTrain();
//            DataSet testData = testAndTrain.getTest();

        }
//        try (RecordReader recordReader = new CSVRecordReader(0, ',')) {
//            recordReader.initialize(new FileSplit(
//                    new ClassPathResource("iris.txt").getFile()));
//
//            DataSetIterator iterator = new RecordReaderDataSetIterator(
//                    recordReader, 150, FEATURES_COUNT, CLASSES_COUNT);
//            DataSet allData = iterator.next();
//            allData.shuffle(42);
//
//            DataNormalization normalizer = new NormalizerStandardize();
//            normalizer.fit(allData);
//            normalizer.transform(allData);
//
//            SplitTestAndTrain testAndTrain = allData.splitTestAndTrain(0.65);
//            DataSet trainingData = testAndTrain.getTrain();
//            DataSet testData = testAndTrain.getTest();
//
//            MultiLayerConfiguration configuration
//                    = new NeuralNetConfiguration.Builder()
//                    .iterations(1000)
//                    .activation(Activation.TANH)
//                    .weightInit(WeightInit.XAVIER)
//                    .learningRate(0.1)
//                    .regularization(true).l2(0.0001)
//                    .list()
//                    .layer(0, new DenseLayer.Builder().nIn(FEATURES_COUNT).nOut(3).build())
//                    .layer(1, new DenseLayer.Builder().nIn(3).nOut(3).build())
//                    .layer(2, new OutputLayer.Builder(
//                            LossFunctions.LossFunction.NEGATIVELOGLIKELIHOOD)
//                            .activation(Activation.SOFTMAX)
//                            .nIn(3).nOut(CLASSES_COUNT).build())
//                    .backprop(true).pretrain(false)
//                    .build();
//
//            MultiLayerNetwork model = new MultiLayerNetwork(configuration);
//            model.init();
//            model.fit(trainingData);
//
//            INDArray output = model.output(testData.getFeatureMatrix());
//            Evaluation eval = new Evaluation(3);
//            eval.eval(testData.getLabels(), output);
//
//            LOGGER.info(eval.stats());
//        }
    }
}

