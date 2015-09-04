package com.example.jgfjhg;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;
import android.graphics.Bitmap;
import android.opengl.GLUtils;

class joannadeathe {

static String TextureName = "joannadeath5.mtl";

static int Vertices = 249;

static int VertTexts = 156;

static int Normals = 96;

static int Faces = 170;

static int FacesB = 0;

static int SmoothGroups = 4;

static float VertArray[] = new float[]{
 0.342004f, 1.063378f, -1.131046f,
 0.925821f, 1.073930f, -1.198515f,
 0.944295f, 0.451149f, -1.209038f,
 0.358250f, 0.441133f, -1.154940f,
 0.297726f, 1.461437f, -1.437544f,
 0.876843f, 1.461576f, -1.539788f,
 0.694109f, -0.398534f, -2.549124f,
 0.114880f, -0.395976f, -2.445408f,
 0.335618f, 1.452717f, 0.865732f,
 1.100288f, 1.375650f, 0.921006f,
 1.172147f, 0.837167f, 1.604470f,
 0.417965f, 0.841737f, 1.647534f,
 0.584860f, -0.244883f, 0.679780f,
 1.095358f, -0.241230f, 0.635987f,
 1.072200f, 0.246846f, 0.490251f,
 0.559238f, 0.271710f, 0.536198f,
 0.863831f, 5.765080f, 1.997449f,
 0.219164f, 4.043975f, 2.507805f,
 0.170716f, 5.045762f, 0.847918f,
 0.198450f, 6.003629f, 1.723533f,
 0.274949f, 4.754625f, 2.568722f,
 1.301501f, 4.213227f, 2.173345f,
 1.221157f, 4.363115f, 1.276904f,
 0.221850f, 3.041690f, 1.440850f,
 0.901181f, 2.899773f, 1.667814f,
 0.935621f, 2.546100f, 2.164713f,
 0.222078f, 2.301514f, 2.326838f,
 0.366874f, 5.507241f, 3.552702f,
 0.959634f, 5.624325f, 3.081012f,
 0.898425f, 5.119226f, 2.389125f,
 0.696910f, 5.084125f, 2.123105f,
 2.052946f, 4.322517f, 1.887939f,
 0.290274f, 6.646544f, 2.688548f,
 0.919088f, 6.229494f, 2.621840f,
 0.670694f, 5.397282f, 1.655087f,
 1.975059f, 4.345616f, 1.427894f,
 1.789109f, 5.028925f, 1.977975f,
 1.722278f, 5.057169f, 1.538277f,
 2.306634f, 3.219738f, 1.617091f,
 2.624607f, 3.400423f, 1.484131f,
 2.488293f, 3.470412f, 1.082066f,
 2.167768f, 3.306869f, 1.160998f,
 0.230526f, 4.849733f, 2.438596f,
 0.183941f, 5.745131f, 1.486633f,
 3.359901f, 1.586833f, 1.085398f,
 3.630759f, 2.248138f, 1.004868f,
 3.410830f, 2.389446f, 0.559392f,
 3.024765f, 1.918328f, 0.414545f,
 0.186525f, 0.560813f, 0.064708f,
 1.537259f, 0.540817f, 1.567398f,
 1.597554f, 1.045180f, 0.621774f,
 0.220976f, 0.435618f, 2.178967f,
 -1.267231f, 4.710377f, 2.212422f,
 -1.262433f, 3.993030f, 1.970082f,
 -1.417715f, 4.843059f, 1.784975f,
 -1.405353f, 4.119911f, 1.551716f,
 -0.299807f, 5.624329f, 3.192527f,
 -0.340578f, 6.229581f, 2.733355f,
 -0.489138f, 2.549616f, 2.161323f,
 -0.456962f, 2.900019f, 1.667243f,
 -0.663337f, 4.187970f, 2.073923f,
 -0.802798f, 4.450187f, 1.209647f,
 -0.287307f, 5.417919f, 1.695006f,
 -0.252972f, 5.091659f, 2.160831f,
 -0.360924f, 5.119278f, 2.500580f,
 -0.395759f, 5.765254f, 2.108815f,
 -1.638177f, 1.139388f, 0.701867f,
 -1.815042f, 1.695669f, 0.125135f,
 -2.142910f, 1.582836f, 0.963010f,
 -2.232372f, 1.895586f, 0.558944f,
 -1.157218f, 2.961618f, 1.415055f,
 -1.290514f, 3.182311f, 1.004092f,
 -1.646174f, 3.176316f, 1.100686f,
 -1.543650f, 2.980735f, 1.470046f,
 -1.002076f, 0.571710f, 1.813119f,
 -1.253358f, 0.955264f, 0.750183f,
 -0.336122f, 1.054620f, -0.844149f,
 -0.918944f, 1.088461f, -0.814541f,
 -0.968120f, 0.469242f, -0.864419f,
 -0.381927f, 0.434433f, -0.906089f,
 -0.298363f, 1.461676f, -1.124163f,
 -0.876843f, 1.461576f, -1.223960f,
 -0.694109f, -0.398534f, -2.233298f,
 -0.114883f, -0.395975f, -2.129759f,
 -0.014680f, 1.328465f, 0.808580f,
 -0.760645f, 1.299254f, 0.998693f,
 -0.730392f, 0.869459f, 1.757877f,
 0.019802f, 0.838532f, 1.674676f,
 -0.345223f, -0.358066f, 0.899632f,
 -0.855243f, -0.333504f, 0.941538f,
 -0.839063f, 0.109879f, 0.786509f,
 -0.325476f, 0.120427f, 0.740756f,
 5.977998f, 2.543890f, 6.306903f,
 5.922239f, 1.500049f, 6.286355f,
 2.513458f, 2.900444f, -0.167725f,
 2.464769f, 1.850404f, -0.205267f,
 0.559238f, 0.271710f, 0.536198f,
 0.559238f, 0.271710f, 0.536198f,
 0.335618f, 1.452717f, 0.865732f,
 0.342004f, 1.063378f, -1.131046f,
 0.297726f, 1.461437f, -1.437544f,
 0.297726f, 1.461437f, -1.437544f,
 0.342004f, 1.063378f, -1.131046f,
 0.297726f, 1.461437f, -1.437544f,
 0.358250f, 0.441133f, -1.154940f,
 0.358250f, 0.441133f, -1.154940f,
 0.297726f, 1.461437f, -1.437544f,
 0.114880f, -0.395976f, -2.445408f,
 0.358250f, 0.441133f, -1.154940f,
 0.114880f, -0.395976f, -2.445408f,
 0.114880f, -0.395976f, -2.445408f,
 0.944295f, 0.451149f, -1.209038f,
 0.944295f, 0.451149f, -1.209038f,
 0.944295f, 0.451149f, -1.209038f,
 0.944295f, 0.451149f, -1.209038f,
 0.925821f, 1.073930f, -1.198515f,
 0.925821f, 1.073930f, -1.198515f,
 0.559238f, 0.271710f, 0.536198f,
 0.559238f, 0.271710f, 0.536198f,
 0.925821f, 1.073930f, -1.198515f,
 0.342004f, 1.063378f, -1.131046f,
 0.696910f, 5.084125f, 2.123105f,
 0.696910f, 5.084125f, 2.123105f,
 1.301501f, 4.213227f, 2.173345f,
 1.301501f, 4.213227f, 2.173345f,
 0.696910f, 5.084125f, 2.123105f,
 0.696910f, 5.084125f, 2.123105f,
 0.670694f, 5.397282f, 1.655087f,
 0.670694f, 5.397282f, 1.655087f,
 0.670694f, 5.397282f, 1.655087f,
 0.696910f, 5.084125f, 2.123105f,
 0.696910f, 5.084125f, 2.123105f,
 1.301501f, 4.213227f, 2.173345f,
 1.221157f, 4.363115f, 1.276904f,
 2.306634f, 3.219738f, 1.617091f,
 2.306634f, 3.219738f, 1.617091f,
 1.221157f, 4.363115f, 1.276904f,
 1.221157f, 4.363115f, 1.276904f,
 1.301501f, 4.213227f, 2.173345f,
 3.359901f, 1.586833f, 1.085398f,
 3.359901f, 1.586833f, 1.085398f,
 2.306634f, 3.219738f, 1.617091f,
 3.024765f, 1.918328f, 0.414545f,
 3.024765f, 1.918328f, 0.414545f,
 2.306634f, 3.219738f, 1.617091f,
 1.221157f, 4.363115f, 1.276904f,
 1.221157f, 4.363115f, 1.276904f,
 0.670694f, 5.397282f, 1.655087f,
 0.670694f, 5.397282f, 1.655087f,
 3.024765f, 1.918328f, 0.414545f,
 0.186525f, 0.560813f, 0.064708f,
 1.597554f, 1.045180f, 0.621774f,
 0.220976f, 0.435618f, 2.178967f,
 0.220976f, 0.435618f, 2.178967f,
 1.597554f, 1.045180f, 0.621774f,
 1.537259f, 0.540817f, 1.567398f,
 0.366874f, 5.507241f, 3.552702f,
 0.290274f, 6.646544f, 2.688548f,
 0.290274f, 6.646544f, 2.688548f,
 0.219164f, 4.043975f, 2.507805f,
 -0.252972f, 5.091659f, 2.160831f,
 0.219164f, 4.043975f, 2.507805f,
 0.230526f, 4.849733f, 2.438596f,
 -0.252972f, 5.091659f, 2.160831f,
 -0.663337f, 4.187970f, 2.073923f,
 -0.663337f, 4.187970f, 2.073923f,
 0.230526f, 4.849733f, 2.438596f,
 0.274949f, 4.754625f, 2.568722f,
 -0.252972f, 5.091659f, 2.160831f,
 0.274949f, 4.754625f, 2.568722f,
 -0.252972f, 5.091659f, 2.160831f,
 0.183941f, 5.745131f, 1.486633f,
 -0.287307f, 5.417919f, 1.695006f,
 0.198450f, 6.003629f, 1.723533f,
 -0.287307f, 5.417919f, 1.695006f,
 0.198450f, 6.003629f, 1.723533f,
 -0.287307f, 5.417919f, 1.695006f,
 -0.252972f, 5.091659f, 2.160831f,
 -0.252972f, 5.091659f, 2.160831f,
 0.222078f, 2.301514f, 2.326838f,
 0.219164f, 4.043975f, 2.507805f,
 0.219164f, 4.043975f, 2.507805f,
 -0.663337f, 4.187970f, 2.073923f,
 -1.157218f, 2.961618f, 1.415055f,
 -0.802798f, 4.450187f, 1.209647f,
 -1.157218f, 2.961618f, 1.415055f,
 -0.802798f, 4.450187f, 1.209647f,
 -0.802798f, 4.450187f, 1.209647f,
 -0.663337f, 4.187970f, 2.073923f,
 -1.638177f, 1.139388f, 0.701867f,
 -1.638177f, 1.139388f, 0.701867f,
 -1.815042f, 1.695669f, 0.125135f,
 -1.157218f, 2.961618f, 1.415055f,
 -1.815042f, 1.695669f, 0.125135f,
 -1.157218f, 2.961618f, 1.415055f,
 -0.802798f, 4.450187f, 1.209647f,
 -0.802798f, 4.450187f, 1.209647f,
 -0.287307f, 5.417919f, 1.695006f,
 0.170716f, 5.045762f, 0.847918f,
 -0.287307f, 5.417919f, 1.695006f,
 0.183941f, 5.745131f, 1.486633f,
 0.170716f, 5.045762f, 0.847918f,
 -1.815042f, 1.695669f, 0.125135f,
 0.198450f, 6.003629f, 1.723533f,
 0.290274f, 6.646544f, 2.688548f,
 0.198450f, 6.003629f, 1.723533f,
 0.366874f, 5.507241f, 3.552702f,
 0.274949f, 4.754625f, 2.568722f,
 0.274949f, 4.754625f, 2.568722f,
 0.221850f, 3.041690f, 1.440850f,
 0.170716f, 5.045762f, 0.847918f,
 0.221850f, 3.041690f, 1.440850f,
 0.186525f, 0.560813f, 0.064708f,
 0.221850f, 3.041690f, 1.440850f,
 0.221850f, 3.041690f, 1.440850f,
 0.220976f, 0.435618f, 2.178967f,
 0.222078f, 2.301514f, 2.326838f,
 0.222078f, 2.301514f, 2.326838f,
 0.186525f, 0.560813f, 0.064708f,
 0.220976f, 0.435618f, 2.178967f,
 -1.253358f, 0.955264f, 0.750183f,
 0.220976f, 0.435618f, 2.178967f,
 -1.002076f, 0.571710f, 1.813119f,
 -1.253358f, 0.955264f, 0.750183f,
 -0.325476f, 0.120427f, 0.740756f,
 -0.014680f, 1.328465f, 0.808580f,
 -0.325476f, 0.120427f, 0.740756f,
 -0.336122f, 1.054620f, -0.844149f,
 -0.298363f, 1.461676f, -1.124163f,
 -0.298363f, 1.461676f, -1.124163f,
 -0.336122f, 1.054620f, -0.844149f,
 -0.381927f, 0.434433f, -0.906089f,
 -0.298363f, 1.461676f, -1.124163f,
 -0.381927f, 0.434433f, -0.906089f,
 -0.114883f, -0.395975f, -2.129759f,
 -0.298363f, 1.461676f, -1.124163f,
 -0.381927f, 0.434433f, -0.906089f,
 -0.114883f, -0.395975f, -2.129759f,
 -0.114883f, -0.395975f, -2.129759f,
 -0.968120f, 0.469242f, -0.864419f,
 -0.968120f, 0.469242f, -0.864419f,
 -0.968120f, 0.469242f, -0.864419f,
 -0.918944f, 1.088461f, -0.814541f,
 -0.968120f, 0.469242f, -0.864419f,
 -0.325476f, 0.120427f, 0.740756f,
 -0.918944f, 1.088461f, -0.814541f,
 -0.325476f, 0.120427f, 0.740756f,
 -0.336122f, 1.054620f, -0.844149f,
 -0.918944f, 1.088461f, -0.814541f,};

static float VertArrayB[] = new float[]{};

static float[] TextArray = new float[]{
 0.006939f, 0.326299f,
 0.090499f, 0.173168f,
 0.105659f, 0.212267f,
 0.055390f, 0.326300f,
 0.015021f, 0.168109f,
 0.054525f, 0.165271f,
 0.064749f, 0.307849f,
 0.025236f, 0.310573f,
 0.006936f, 0.973168f,
 0.148951f, 0.973168f,
 0.102753f, 0.881533f,
 0.055389f, 0.881533f,
 0.055390f, 0.579866f,
 0.102750f, 0.579866f,
 0.148951f, 0.621715f,
 0.006938f, 0.621714f,
 0.453876f, 0.791903f,
 0.201824f, 0.532079f,
 0.590263f, 0.596995f,
 0.556897f, 0.779659f,
 0.235400f, 0.777966f,
 0.367224f, 0.573251f,
 0.453040f, 0.577674f,
 0.566387f, 0.397259f,
 0.470805f, 0.365178f,
 0.365778f, 0.346308f,
 0.249833f, 0.335338f,
 0.289739f, 0.984705f,
 0.362886f, 0.905310f,
 0.354538f, 0.788048f,
 0.662213f, 0.973243f,
 0.649436f, 0.842323f,
 0.523433f, 0.983917f,
 0.451956f, 0.900429f,
 0.700374f, 0.973112f,
 0.714202f, 0.842324f,
 0.662213f, 0.871337f,
 0.700374f, 0.871169f,
 0.611238f, 0.659338f,
 0.649436f, 0.659338f,
 0.714202f, 0.659338f,
 0.749335f, 0.659338f,
 0.262276f, 0.714547f,
 0.539459f, 0.732725f,
 0.635368f, 0.320085f,
 0.647458f, 0.410463f,
 0.714202f, 0.410460f,
 0.727698f, 0.329948f,
 0.754615f, 0.048462f,
 0.320425f, 0.069876f,
 0.504948f, 0.016928f,
 0.147427f, 0.097935f,
 0.662213f, 0.871337f,
 0.649436f, 0.842323f,
 0.700374f, 0.871169f,
 0.714202f, 0.842324f,
 0.362886f, 0.905310f,
 0.451956f, 0.900429f,
 0.365778f, 0.346308f,
 0.470805f, 0.365178f,
 0.367224f, 0.573251f,
 0.453040f, 0.577674f,
 0.700374f, 0.973112f,
 0.662213f, 0.973243f,
 0.354538f, 0.788048f,
 0.453876f, 0.791903f,
 0.635368f, 0.320085f,
 0.727698f, 0.329948f,
 0.647458f, 0.410463f,
 0.714202f, 0.410460f,
 0.611238f, 0.659338f,
 0.749335f, 0.659338f,
 0.714202f, 0.659338f,
 0.649436f, 0.659338f,
 0.320425f, 0.069876f,
 0.504948f, 0.016928f,
 0.006939f, 0.326299f,
 0.090499f, 0.173168f,
 0.105659f, 0.212267f,
 0.055390f, 0.326300f,
 0.015021f, 0.168109f,
 0.054525f, 0.165271f,
 0.064749f, 0.307849f,
 0.025236f, 0.310573f,
 0.006936f, 0.973168f,
 0.148951f, 0.973168f,
 0.102753f, 0.881533f,
 0.055389f, 0.881533f,
 0.055390f, 0.579866f,
 0.102750f, 0.579866f,
 0.148951f, 0.621715f,
 0.006938f, 0.621714f,
 0.829311f, 0.001810f,
 0.999173f, 0.001810f,
 0.829311f, 0.998093f,
 0.999173f, 0.998093f,
 0.196341f, 0.621715f,
 0.196341f, 0.621715f,
 0.196341f, 0.973168f,
 0.099486f, 0.134595f,
 0.063514f, 0.126699f,
 0.063514f, 0.126699f,
 0.099486f, 0.134595f,
 0.063514f, 0.126699f,
 0.129579f, 0.105546f,
 0.129579f, 0.105546f,
 0.063514f, 0.126699f,
 0.132466f, 0.001616f,
 0.142109f, 0.227760f,
 0.101198f, 0.323344f,
 0.101198f, 0.323344f,
 0.102748f, 0.326300f,
 0.102748f, 0.326300f,
 0.102748f, 0.326300f,
 0.102748f, 0.326300f,
 0.148951f, 0.326300f,
 0.148951f, 0.326300f,
 0.196341f, 0.621715f,
 0.196341f, 0.621715f,
 0.148951f, 0.326300f,
 0.196341f, 0.326300f,
 0.353637f, 0.718421f,
 0.353637f, 0.718421f,
 0.611238f, 0.872595f,
 0.611238f, 0.872595f,
 0.353637f, 0.718421f,
 0.353637f, 0.718421f,
 0.452577f, 0.721572f,
 0.452577f, 0.721572f,
 0.452577f, 0.721572f,
 0.353637f, 0.718421f,
 0.353637f, 0.718421f,
 0.806916f, 0.873085f,
 0.749335f, 0.873085f,
 0.806916f, 0.659338f,
 0.806916f, 0.659338f,
 0.749335f, 0.873085f,
 0.749335f, 0.873085f,
 0.611238f, 0.872595f,
 0.611238f, 0.410462f,
 0.806916f, 0.410462f,
 0.806916f, 0.659338f,
 0.749335f, 0.410462f,
 0.749335f, 0.410462f,
 0.806916f, 0.659338f,
 0.749335f, 0.873085f,
 0.749335f, 0.873085f,
 0.452577f, 0.721572f,
 0.452577f, 0.721572f,
 0.749335f, 0.410462f,
 0.747690f, 0.223911f,
 0.756142f, 0.248493f,
 0.724061f, 0.244264f,
 0.724061f, 0.244264f,
 0.756142f, 0.248493f,
 0.737676f, 0.256798f,
 0.289739f, 0.984705f,
 0.523433f, 0.983917f,
 0.523433f, 0.983917f,
 0.201824f, 0.532079f,
 0.353637f, 0.718421f,
 0.201824f, 0.532079f,
 0.262276f, 0.714547f,
 0.353637f, 0.718421f,
 0.611238f, 0.872595f,
 0.611238f, 0.872595f,
 0.262276f, 0.714547f,
 0.235400f, 0.777966f,
 0.353637f, 0.718421f,
 0.235400f, 0.777966f,
 0.353637f, 0.718421f,
 0.539459f, 0.732725f,
 0.452577f, 0.721572f,
 0.556897f, 0.779659f,
 0.452577f, 0.721572f,
 0.556897f, 0.779659f,
 0.452577f, 0.721572f,
 0.353637f, 0.718421f,
 0.353637f, 0.718421f,
 0.249833f, 0.335338f,
 0.201824f, 0.532079f,
 0.201824f, 0.532079f,
 0.806916f, 0.873085f,
 0.806916f, 0.659338f,
 0.749335f, 0.873085f,
 0.806916f, 0.659338f,
 0.749335f, 0.873085f,
 0.749335f, 0.873085f,
 0.611238f, 0.872595f,
 0.611238f, 0.410462f,
 0.806916f, 0.410462f,
 0.749335f, 0.410462f,
 0.806916f, 0.659338f,
 0.749335f, 0.410462f,
 0.806916f, 0.659338f,
 0.749335f, 0.873085f,
 0.749335f, 0.873085f,
 0.452577f, 0.721572f,
 0.590263f, 0.596995f,
 0.452577f, 0.721572f,
 0.539459f, 0.732725f,
 0.590263f, 0.596995f,
 0.749335f, 0.410462f,
 0.556897f, 0.779659f,
 0.523433f, 0.983917f,
 0.556897f, 0.779659f,
 0.289739f, 0.984705f,
 0.235400f, 0.777966f,
 0.235400f, 0.777966f,
 0.566387f, 0.397259f,
 0.590263f, 0.596995f,
 0.566387f, 0.397259f,
 0.754615f, 0.048462f,
 0.566387f, 0.397259f,
 0.566387f, 0.397259f,
 0.147427f, 0.097935f,
 0.249833f, 0.335338f,
 0.249833f, 0.335338f,
 0.747690f, 0.223911f,
 0.724061f, 0.244264f,
 0.756142f, 0.248493f,
 0.724061f, 0.244264f,
 0.737676f, 0.256798f,
 0.756142f, 0.248493f,
 0.196341f, 0.621715f,
 0.196341f, 0.973168f,
 0.196341f, 0.621715f,
 0.099486f, 0.134595f,
 0.063514f, 0.126699f,
 0.063514f, 0.126699f,
 0.099486f, 0.134595f,
 0.129579f, 0.105546f,
 0.063514f, 0.126699f,
 0.129579f, 0.105546f,
 0.132466f, 0.001616f,
 0.063514f, 0.126699f,
 0.142109f, 0.227760f,
 0.101198f, 0.323344f,
 0.101198f, 0.323344f,
 0.102748f, 0.326300f,
 0.102748f, 0.326300f,
 0.102748f, 0.326300f,
 0.148951f, 0.326300f,
 0.102748f, 0.326300f,
 0.196341f, 0.621715f,
 0.148951f, 0.326300f,
 0.196341f, 0.621715f,
 0.196341f, 0.326300f,
 0.148951f, 0.326300f,};

static float[] TextArrayB = new float[]{};

static float[][] NormArray = new float[][]{
{ -0.681777f, 0.550817f, -0.481436f},
{ 0.506559f, 0.534401f, -0.676619f},
{ -0.752811f, -0.236992f, -0.614093f},
{ 0.513343f, -0.240491f, -0.823798f},
{ -0.660920f, -0.569714f, 0.488478f},
{ -0.467457f, -0.865272f, 0.181074f},
{ 0.699410f, -0.500536f, 0.510185f},
{ 0.534077f, -0.842449f, 0.071001f},
{ -0.702151f, 0.064898f, -0.709065f},
{ -0.922681f, 0.370986f, -0.105017f},
{ 0.900262f, 0.416070f, -0.128120f},
{ 0.675159f, 0.210343f, -0.707048f},
{ -0.595232f, 0.651114f, 0.470903f},
{ 0.665554f, 0.668133f, 0.332621f},
{ 0.875043f, -0.472823f, -0.103623f},
{ -0.834688f, -0.524442f, 0.168100f},
{ 0.464474f, 0.507819f, 0.725523f},
{ 0.674195f, 0.118637f, 0.728962f},
{ 0.354735f, 0.613675f, -0.705383f},
{ 0.523057f, 0.409077f, -0.747709f},
{ 0.088635f, -0.115168f, 0.989384f},
{ 0.805226f, -0.036537f, 0.591841f},
{ 0.009586f, 0.995830f, 0.090726f},
{ 0.782425f, 0.621139f, -0.044702f},
{ 0.646121f, -0.050358f, 0.761572f},
{ 0.831136f, 0.165771f, -0.530786f},
{ 0.386673f, -0.271071f, 0.881478f},
{ 0.259780f, -0.216061f, -0.941187f},
{ 0.554265f, 0.615097f, -0.560755f},
{ 0.475129f, 0.257148f, 0.841503f},
{ -0.037350f, 0.012205f, 0.999228f},
{ 0.039897f, -0.106068f, 0.993558f},
{ 0.039279f, -0.872099f, 0.487751f},
{ 0.863934f, -0.495466f, 0.090175f},
{ -0.024466f, 0.674929f, -0.737477f},
{ -0.054761f, 0.765187f, -0.641476f},
{ 0.830207f, 0.323253f, -0.454163f},
{ 0.038179f, -0.115699f, 0.992550f},
{ -0.303429f, -0.773287f, 0.556739f},
{ -0.725184f, -0.502091f, -0.471182f},
{ 0.825609f, 0.118519f, 0.551655f},
{ 0.408923f, 0.495606f, -0.766261f},
{ -0.443884f, -0.618520f, 0.648383f},
{ -0.783849f, -0.386312f, -0.486152f},
{ 0.353917f, 0.584554f, -0.730096f},
{ 0.785580f, 0.389479f, 0.480802f},
{ 0.014395f, 0.114417f, -0.993329f},
{ 0.793792f, -0.423789f, 0.436230f},
{ 0.739750f, -0.037476f, -0.671837f},
{ -0.015587f, 0.193391f, -0.980998f},
{ -0.033078f, -0.310120f, -0.950122f},
{ 0.080327f, -0.707657f, 0.701975f},
{ -0.405852f, 0.269086f, 0.873428f},
{ -0.690862f, 0.638115f, -0.339880f},
{ -0.447472f, -0.326366f, 0.832619f},
{ -0.881482f, 0.245869f, -0.403160f},
{ -0.688958f, -0.033980f, 0.724005f},
{ -0.778526f, 0.620028f, 0.097275f},
{ -0.657954f, 0.002908f, 0.753052f},
{ -0.366734f, -0.249895f, 0.896136f},
{ -0.838385f, 0.173136f, -0.516851f},
{ -0.302070f, -0.005614f, -0.953269f},
{ -0.633518f, 0.636913f, -0.439314f},
{ -0.573908f, 0.163534f, 0.802426f},
{ -0.833086f, -0.492884f, 0.251064f},
{ -0.900137f, 0.334429f, -0.279125f},
{ 0.795526f, -0.598828f, 0.092427f},
{ -0.449080f, -0.405451f, 0.796201f},
{ 0.545781f, 0.012207f, -0.837839f},
{ -0.868722f, 0.354378f, -0.346032f},
{ 0.890577f, -0.406400f, 0.204231f},
{ 0.532311f, 0.138257f, -0.835183f},
{ -0.839835f, 0.449112f, -0.304920f},
{ -0.549934f, -0.140287f, 0.823342f},
{ -0.755558f, -0.358502f, 0.548278f},
{ -0.804869f, -0.054412f, -0.590953f},
{ 0.650539f, 0.572201f, -0.499385f},
{ 0.734030f, -0.250673f, -0.631160f},
{ -0.529919f, 0.532411f, -0.660094f},
{ -0.524191f, -0.259452f, -0.811116f},
{ 0.705370f, -0.543473f, 0.455072f},
{ -0.604123f, -0.399228f, 0.689675f},
{ 0.396306f, -0.907187f, 0.141260f},
{ -0.479147f, -0.860319f, 0.173983f},
{ 0.553637f, -0.095994f, -0.827207f},
{ 0.926722f, 0.282673f, -0.247553f},
{ -0.907583f, 0.418426f, 0.034822f},
{ -0.768327f, 0.123148f, -0.628099f},
{ 0.678154f, 0.587518f, 0.441509f},
{ -0.597930f, 0.661357f, 0.452866f},
{ -0.903766f, -0.418363f, -0.090441f},
{ 0.815443f, -0.563623f, 0.131836f},
{ 0.880215f, -0.037706f, -0.473075f},
{ 0.880369f, -0.036459f, -0.472886f},
{ 0.881689f, -0.025266f, -0.471154f},
{ 0.881825f, -0.024051f, -0.470962f}};

static int[] FaceArray = new int[]{
4, 5, 7,
7, 5, 6,
11, 12, 10,
10, 12, 13,
8, 15, 11,
11, 15, 12,
14, 96, 9,
9, 97, 98,
13, 14, 10,
10, 14, 9,
99, 1, 100,
101, 1, 5,
1, 2, 5,
5, 2, 6,
102, 103, 104,
105, 106, 107,
108, 109, 2,
2, 110, 6,
13, 12, 111,
112, 12, 3,
13, 113, 14,
14, 114, 115,
14, 116, 117,
118, 119, 120,
12, 15, 3,
3, 15, 0,
36, 31, 37,
37, 31, 35,
27, 28, 32,
32, 28, 33,
25, 24, 21,
21, 24, 22,
37, 34, 36,
36, 34, 30,
21, 121, 17,
17, 122, 42,
31, 36, 123,
124, 36, 30,
42, 125, 20,
20, 126, 29,
43, 19, 127,
128, 19, 16,
129, 16, 130,
131, 16, 29,
29, 16, 28,
28, 16, 33,
26, 25, 17,
17, 25, 21,
44, 47, 45,
45, 47, 46,
132, 133, 134,
135, 136, 41,
137, 35, 41,
41, 35, 40,
138, 38, 31,
31, 38, 39,
31, 39, 35,
35, 39, 40,
39, 38, 45,
45, 38, 139,
140, 141, 142,
143, 144, 41,
40, 39, 46,
46, 39, 45,
35, 145, 37,
37, 146, 34,
22, 18, 147,
148, 18, 43,
149, 41, 46,
46, 41, 40,
16, 19, 33,
33, 19, 32,
27, 20, 28,
28, 20, 29,
25, 49, 24,
24, 49, 50,
24, 23, 22,
22, 23, 18,
48, 23, 50,
50, 23, 24,
51, 49, 26,
26, 49, 25,
150, 151, 152,
153, 154, 155,
52, 54, 53,
54, 55, 53,
156, 157, 56,
158, 57, 56,
58, 60, 59,
60, 61, 59,
54, 52, 62,
52, 63, 62,
60, 159, 160,
161, 162, 163,
53, 164, 52,
165, 63, 52,
166, 167, 168,
169, 64, 170,
171, 172, 173,
174, 65, 175,
176, 177, 65,
178, 64, 65,
64, 56, 65,
56, 57, 65,
179, 180, 58,
181, 60, 58,
66, 68, 67,
68, 69, 67,
182, 183, 184,
185, 71, 186,
187, 71, 55,
71, 72, 55,
188, 53, 70,
53, 73, 70,
53, 55, 73,
55, 72, 73,
73, 68, 70,
68, 189, 70,
190, 191, 192,
193, 71, 194,
72, 69, 73,
69, 68, 73,
55, 54, 195,
54, 62, 196,
61, 197, 198,
199, 200, 201,
202, 69, 71,
69, 72, 71,
65, 57, 203,
57, 204, 205,
206, 56, 207,
56, 64, 208,
58, 59, 74,
59, 75, 74,
59, 61, 209,
61, 210, 211,
212, 75, 213,
75, 59, 214,
215, 216, 74,
217, 58, 74,
218, 219, 220,
221, 222, 223,
80, 83, 81,
83, 82, 81,
87, 86, 88,
86, 89, 88,
84, 87, 91,
87, 88, 91,
90, 85, 224,
85, 225, 226,
89, 86, 90,
86, 85, 90,
227, 228, 77,
229, 81, 77,
77, 81, 78,
81, 82, 78,
230, 231, 232,
233, 234, 235,
236, 78, 237,
78, 82, 238,
89, 239, 88,
240, 79, 88,
89, 90, 241,
90, 242, 243,
90, 244, 245,
246, 247, 248,
88, 79, 91,
79, 76, 91,
92, 93, 94,
94, 93, 95, };

static int[] FaceArrayB = new int[]{};

static int[] textures = new int[1];
static Bitmap ModelTexture;
private static FloatBuffer mFVertexBuffer;
private static FloatBuffer mFTextureBuffer;
private static ByteBuffer  mModel;

private static FloatBuffer mFVertexBufferB;
private static FloatBuffer mFTextureBufferB;
private static ByteBuffer  mModelB;

public static void SetupBuffers(){
byte tModel[] = new byte[FaceArray.length]; 	
for (int i = 0; i < FaceArray.length; i++){
tModel[i] = (byte) (FaceArray[i]);
}
 for (int i = 0; i < TextArray.length; i+= 2){
TextArray[i+1] = TextArray[i+1] * -1;
}
byte tModelB[] = new byte[FaceArrayB.length]; 	
for (int i = 0; i < FaceArrayB.length; i++){
tModelB[i] = (byte) (FaceArrayB[i]);
}
 for (int i = 0; i < TextArrayB.length; i+= 2){
TextArrayB[i+1] = TextArrayB[i+1] * -1;
}
ByteBuffer vbb = ByteBuffer.allocateDirect(VertArray.length * 4);
vbb.order(ByteOrder.nativeOrder());
mFVertexBuffer = vbb.asFloatBuffer();
mFVertexBuffer.put(VertArray);
mFVertexBuffer.position(0);
ByteBuffer tbb = ByteBuffer.allocateDirect(TextArray.length * 4);
tbb.order(ByteOrder.nativeOrder());
mFTextureBuffer = tbb.asFloatBuffer();
mFTextureBuffer.put(TextArray);
mFTextureBuffer.position(0);
mModel = ByteBuffer.allocateDirect(FaceArray.length);
mModel.put(tModel);
mModel.position(0);
Faces = FaceArray.length;
VertArray = null;
TextArray = null;
FaceArray = null;
ByteBuffer vBbb = ByteBuffer.allocateDirect(VertArrayB.length * 4);
vBbb.order(ByteOrder.nativeOrder());
mFVertexBufferB = vBbb.asFloatBuffer();
mFVertexBufferB.put(VertArrayB);
mFVertexBufferB.position(0);
ByteBuffer tBbb = ByteBuffer.allocateDirect(TextArrayB.length * 4);
tBbb.order(ByteOrder.nativeOrder());
mFTextureBufferB = tBbb.asFloatBuffer();
mFTextureBufferB.put(TextArrayB);
mFTextureBufferB.position(0);
mModelB = ByteBuffer.allocateDirect(FaceArrayB.length);
mModelB.put(tModelB);
mModelB.position(0);
FacesB = FaceArrayB.length;
VertArrayB = null;
TextArrayB = null;
FaceArrayB = null;
}

public static void TextureSetup(GL10 gl, Bitmap Texture){
ModelTexture = Texture;
gl.glGenTextures(1, textures, 0);
gl.glBindTexture(GL10.GL_TEXTURE_2D, textures[0]);
gl.glTexParameterf(GL10.GL_TEXTURE_2D, GL10.GL_TEXTURE_MIN_FILTER, GL10.GL_NEAREST);
gl.glTexParameterf(GL10.GL_TEXTURE_2D, GL10.GL_TEXTURE_MAG_FILTER, GL10.GL_LINEAR);
GLUtils.texImage2D(GL10.GL_TEXTURE_2D, 0, ModelTexture, 0);
}

public static void draw(GL10 gl){
gl.glAlphaFunc(gl.GL_GREATER, 0.1f);
gl.glEnable(gl.GL_ALPHA_TEST);
gl.glBindTexture(GL10.GL_TEXTURE_2D, textures[0]);
gl.glVertexPointer(3, GL11.GL_FLOAT, 0, mFVertexBuffer);
gl.glTexCoordPointer(2, GL10.GL_FLOAT, 0, mFTextureBuffer);
gl.glDrawElements( gl.GL_TRIANGLES, Faces, gl.GL_UNSIGNED_BYTE, mModel);
gl.glVertexPointer(3, GL11.GL_FLOAT, 0, mFVertexBufferB);
gl.glTexCoordPointer(2, GL10.GL_FLOAT, 0, mFTextureBufferB);
gl.glDrawElements( gl.GL_TRIANGLES, FacesB, gl.GL_UNSIGNED_BYTE, mModelB);
}

}


//Vertices: 249  Texture Co-ords: 156  Normals: 96  Texture: joannadeath5.mtl Faces: 170 Smooth Groups: 4 sucess: 80 Doubles: 90 Redos needed: 153 Correct: 117