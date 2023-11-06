using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;

namespace ServiciosSOAP
{
    /// <summary>
    /// Descripción breve de Operaciones
    /// </summary>
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    // Para permitir que se llame a este servicio web desde un script, usando ASP.NET AJAX, quite la marca de comentario de la línea siguiente. 
    // [System.Web.Script.Services.ScriptService]
    public class Operaciones : System.Web.Services.WebService
    {

        [WebMethod]
        public string pronostico(string fecha)
        {
            string respuesta=null;
            switch (fecha)
            {
                case "temperatura:04-02-21":
                    respuesta = "21";break;
                case "temperatura:05-02-21":
                    respuesta = "22";break;
                case "temperatura:06-02-21":
                    respuesta = "25"; break;
                case "temperatura:07-02-21":
                    respuesta = "26"; break;
                case "temperatura:08-02-21":
                    respuesta = "28"; break;
                case "temperatura:09-02-21":
                    respuesta = "19"; break;
                case "temperatura:10-02-21":
                    respuesta = "22"; break;
                case "temperatura:11-02-21":
                    respuesta = "12";break;
                case "temperatura:12-02-21":
                    respuesta = "18"; break;
                
                case "probabilidad:04-02-21":
                    respuesta = "36.74%"; break;
                case "probabilidad:05-02-21":
                    respuesta = "80%"; break;
                case "probabilidad:06-02-21":
                    respuesta = "1.26%"; break;
                case "probabilidad:07-02-21":
                    respuesta = "0.42%"; break;
                case "probabilidad:08-02-21":
                    respuesta = "46.85%"; break;
                case "probabilidad:09-02-21":
                    respuesta = "4.21%"; break;
                case "probabilidad:10-02-21":
                    respuesta = "8.79%"; break;
                case "probabilidad:11-02-21":
                    respuesta = "0.69%"; break;
                case "probabilidad:12-02-21":
                    respuesta = "0.65%"; break;

            }
            return respuesta;
        }
        [WebMethod]
        public string fechas()
        {
            return "04-02-21,05-02-21,06-02-21,07-02-21,08-02-21,09-02-21,10-02-21,11-02-21,12-02-21";
        }



    }
}
