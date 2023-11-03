using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;

/// <summary>
/// Descripción breve de WebService
/// </summary>
[WebService(Namespace = "http://tempuri.org/")]
[WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
// Para permitir que se llame a este servicio web desde un script, usando ASP.NET AJAX, quite la marca de comentario de la línea siguiente. 
// [System.Web.Script.Services.ScriptService]
public class WebService : System.Web.Services.WebService
{
    
    public WebService()
    {

        //Elimine la marca de comentario de la línea siguiente si utiliza los componentes diseñados 
        //InitializeComponent(); 
    }

    /// <summary>
    /// Comvertir de US a Bs
    /// </summary>
    ///<param name="num1">Cantidad</param>
    /// <returns>resultado</returns>
    [WebMethod]
    public float comvertirUS(float num1)
    {
        
        return num1*6.96f;
    }

    /// <summary>
    /// Comverir de EU a Bs
    /// </summary>
    ///<param name="num2">Cantidad</param>
    /// <returns>resultado</returns>
    [WebMethod]
    public float comvertirEU(float num2)
    {
        return num2*8.5f;
    }

}
