using Newtonsoft.Json;
using System;
using System.Net.Http;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ConsumirServicioRest
{
    public partial class Form1 : Form
    {
        private string url = "http://localhost:8001/api/";
        private string token;
        public Form1()
        {
            InitializeComponent();
        }

        private async void button1_Click(object sender, EventArgs e)
        {
            string apiUrl = this.url + "pronostico";


            using (HttpClient client = new HttpClient())
            {
                try


                {
                    // Agregar el encabezado de autorización con el token Bearer
                    //client.DefaultRequestHeaders.Add("Authorization", "Bearer " + this.token);


                    // Realizar una solicitud GET al servicio REST
                    HttpResponseMessage response = await client.GetAsync(apiUrl);

                    // Verificar si la solicitud fue exitosa
                    if (response.IsSuccessStatusCode)
                    {
                        // Leer el contenido de la respuesta como una cadena
                        string responseBody = await response.Content.ReadAsStringAsync();


                        // Aquí puedes procesar la respuesta como desees
                        MessageBox.Show("Respuesta del servicio REST: " + responseBody);
                    }
                    else
                    {
                        MessageBox.Show("Error al llamar al servicio. Código de estado: " + response.StatusCode);
                    }
                }
                catch (Exception ex)
                {
                    MessageBox.Show("Error al llamar al servicio: " + ex.Message);
                }
            }
        }



        private async void button3_Click(object sender, EventArgs e)
        {
            if (boxId.Text.Length == 0) return;
            string apiUrl = this.url + "pronostico/" + boxId.Text;





            using (HttpClient client = new HttpClient())
            {
                try


                {
                    // Agregar el encabezado de autorización con el token Bearer
                    //client.DefaultRequestHeaders.Add("Authorization", "Bearer " + this.token);


                    // Realizar una solicitud GET al servicio REST
                    HttpResponseMessage response = await client.GetAsync(apiUrl);

                    // Verificar si la solicitud fue exitosa
                    if (response.IsSuccessStatusCode)
                    {
                        // Leer el contenido de la respuesta como una cadena
                        string responseBody = await response.Content.ReadAsStringAsync();


                        // Aquí puedes procesar la respuesta como desees
                        MessageBox.Show("Respuesta del servicio REST: " + responseBody);
                    }
                    else
                    {
                        MessageBox.Show("Error al llamar al servicio. Código de estado: " + response.StatusCode);
                    }
                }
                catch (Exception ex)
                {
                    MessageBox.Show("Error al llamar al servicio: " + ex.Message);
                }
            }
        }

        private async void button4_Click(object sender, EventArgs e)
        {
            // URL del servicio REST que deseas consumir
            string apiUrl = this.url + "pronostico";

            // Datos de autenticación en formato JSON
            string jsonRequest = "{\"id\": \"" + PostId.Text + "\", \"fecha\": \"" + PostFecha.Text + "\",\"temperatura\":\"" + PostTemperatura.Text + "\",\"probabilidad\":\"" + PostProbabilidad.Text + "\"}";
            Console.WriteLine(jsonRequest);

            using (HttpClient client = new HttpClient())
            {
                try
                {
                    // Crear una solicitud HTTP POST con los datos JSON
                    var content = new StringContent(jsonRequest, Encoding.UTF8, "application/json");

                    // Realizar una solicitud POST al servicio REST
                    HttpResponseMessage response = await client.PostAsync(apiUrl, content);

                    // Verificar si la solicitud fue exitosa
                    if (response.IsSuccessStatusCode)
                    {
                        // Leer el contenido de la respuesta como una cadena
                        string responseBody = await response.Content.ReadAsStringAsync();

                        // Deserializar la respuesta JSON
                        //var jsonResponse = JsonConvert.DeserializeObject<AuthenticationResponse>(responseBody);
                        //MessageBox.Show(responseBody);
                        // Acceder a los campos individuales
                        //string token = jsonResponse.authorization.token;
                        //this.token = token;
                        //string type = jsonResponse.authorization.type;
                        //long expires = jsonResponse.authorization.expires;



                        // Aquí puedes utilizar los valores como desees
                        //MessageBox.Show("Token: " + token + "\nType: ");
                    }
                    else
                    {
                        MessageBox.Show("Error al hacer post: " + response.StatusCode);
                    }

                }
                catch (Exception ex)
                {
                    MessageBox.Show("Error al llamar al servicio: " + ex.Message);
                }
            }
        }

        private async void button5_Click(object sender, EventArgs e)
        {
            // URL del servicio REST que deseas consumir
            string apiUrl = this.url + "pronostico/" + boxDelete.Text;

            // Datos de autenticación en formato JSON
            string jsonRequest = "{\"id\": \"" + PostId.Text + "\", \"fecha\": \"" + PostFecha.Text + "\",\"temperatura\":\"" + PostTemperatura.Text + "\",\"probabilidad\":\"" + PostProbabilidad.Text + "\"}";
            Console.WriteLine(jsonRequest);

            using (HttpClient client = new HttpClient())
            {
                try
                {
                    // Crear una solicitud HTTP POST con los datos JSON
                    var content = new StringContent(jsonRequest, Encoding.UTF8, "application/json");

                    // Realizar una solicitud POST al servicio REST
                    HttpResponseMessage response = await client.DeleteAsync(apiUrl);

                    // Verificar si la solicitud fue exitosa
                    if (response.IsSuccessStatusCode)
                    {
                        // Leer el contenido de la respuesta como una cadena
                        string responseBody = await response.Content.ReadAsStringAsync();

                        // Deserializar la respuesta JSON
                        //var jsonResponse = JsonConvert.DeserializeObject<AuthenticationResponse>(responseBody);
                        //MessageBox.Show(responseBody);
                        // Acceder a los campos individuales
                        //string token = jsonResponse.authorization.token;
                        //this.token = token;
                        //string type = jsonResponse.authorization.type;
                        //long expires = jsonResponse.authorization.expires;



                        // Aquí puedes utilizar los valores como desees
                        //MessageBox.Show("Token: " + token + "\nType: ");
                    }
                    else
                    {
                        MessageBox.Show("Error al hacer post: " + response.StatusCode);
                    }

                }
                catch (Exception ex)
                {
                    MessageBox.Show("Error al llamar al servicio: " + ex.Message);
                }
            }

        }

        private async void button2_Click(object sender, EventArgs e)
        {
            // URL del servicio REST que deseas consumir
            string apiUrl = this.url + "pronostico/" + PutId.Text;

            // Datos de autenticación en formato JSON
            string jsonRequest = "{\"id\": \"" + PutId.Text + "\", \"fecha\": \"" + PutFecha.Text + "\",\"temperatura\":\"" + PutTemperatura.Text + "\",\"probabilidad\":\"" + PutProbabilidad.Text + "\"}";
            Console.WriteLine(jsonRequest);

            using (HttpClient client = new HttpClient())
            {
                try
                {
                    // Crear una solicitud HTTP POST con los datos JSON
                    var content = new StringContent(jsonRequest, Encoding.UTF8, "application/json");

                    // Realizar una solicitud POST al servicio REST
                    HttpResponseMessage response = await client.PutAsync(apiUrl, content);

                    // Verificar si la solicitud fue exitosa
                    if (response.IsSuccessStatusCode)
                    {
                        // Leer el contenido de la respuesta como una cadena
                        string responseBody = await response.Content.ReadAsStringAsync();

                        // Deserializar la respuesta JSON
                        //var jsonResponse = JsonConvert.DeserializeObject<AuthenticationResponse>(responseBody);
                        //MessageBox.Show(responseBody);
                        // Acceder a los campos individuales
                        //string token = jsonResponse.authorization.token;
                        //this.token = token;
                        //string type = jsonResponse.authorization.type;
                        //long expires = jsonResponse.authorization.expires;



                        // Aquí puedes utilizar los valores como desees
                        //MessageBox.Show("Token: " + token + "\nType: ");
                    }
                    else
                    {
                        MessageBox.Show("Error al hacer post: " + response.StatusCode);
                    }

                }
                catch (Exception ex)
                {
                    MessageBox.Show("Error al llamar al servicio: " + ex.Message);
                }
            }
        }

        private void label6_Click(object sender, EventArgs e)
        {
        }

        private void label7_Click(object sender, EventArgs e)
        {
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {
        }

        private void label5_Click(object sender, EventArgs e)
        {
        }

        private void textBox3_TextChanged(object sender, EventArgs e)
        {
        }

        private void textBox4_TextChanged(object sender, EventArgs e)
        {
        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {
        }

        private void label8_Click(object sender, EventArgs e)
        {
        }
    }
}
