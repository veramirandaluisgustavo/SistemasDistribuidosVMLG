﻿//------------------------------------------------------------------------------
// <auto-generated>
//     Este código fue generado por una herramienta.
//     Versión de runtime:4.0.30319.42000
//
//     Los cambios en este archivo podrían causar un comportamiento incorrecto y se perderán si
//     se vuelve a generar el código.
// </auto-generated>
//------------------------------------------------------------------------------

namespace WindowsFormsApp1.ServiceReference1 {
    
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ServiceModel.ServiceContractAttribute(ConfigurationName="ServiceReference1.OperacionesSoap")]
    public interface OperacionesSoap {
        
        // CODEGEN: Se está generando un contrato de mensaje, ya que el nombre de elemento fecha del espacio de nombres http://tempuri.org/ no está marcado para aceptar valores nil.
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/pronostico", ReplyAction="*")]
        WindowsFormsApp1.ServiceReference1.pronosticoResponse pronostico(WindowsFormsApp1.ServiceReference1.pronosticoRequest request);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/pronostico", ReplyAction="*")]
        System.Threading.Tasks.Task<WindowsFormsApp1.ServiceReference1.pronosticoResponse> pronosticoAsync(WindowsFormsApp1.ServiceReference1.pronosticoRequest request);
        
        // CODEGEN: Se está generando un contrato de mensaje, ya que el nombre de elemento fechasResult del espacio de nombres http://tempuri.org/ no está marcado para aceptar valores nil.
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/fechas", ReplyAction="*")]
        WindowsFormsApp1.ServiceReference1.fechasResponse fechas(WindowsFormsApp1.ServiceReference1.fechasRequest request);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/fechas", ReplyAction="*")]
        System.Threading.Tasks.Task<WindowsFormsApp1.ServiceReference1.fechasResponse> fechasAsync(WindowsFormsApp1.ServiceReference1.fechasRequest request);
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class pronosticoRequest {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Name="pronostico", Namespace="http://tempuri.org/", Order=0)]
        public WindowsFormsApp1.ServiceReference1.pronosticoRequestBody Body;
        
        public pronosticoRequest() {
        }
        
        public pronosticoRequest(WindowsFormsApp1.ServiceReference1.pronosticoRequestBody Body) {
            this.Body = Body;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.Runtime.Serialization.DataContractAttribute(Namespace="http://tempuri.org/")]
    public partial class pronosticoRequestBody {
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false, Order=0)]
        public string fecha;
        
        public pronosticoRequestBody() {
        }
        
        public pronosticoRequestBody(string fecha) {
            this.fecha = fecha;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class pronosticoResponse {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Name="pronosticoResponse", Namespace="http://tempuri.org/", Order=0)]
        public WindowsFormsApp1.ServiceReference1.pronosticoResponseBody Body;
        
        public pronosticoResponse() {
        }
        
        public pronosticoResponse(WindowsFormsApp1.ServiceReference1.pronosticoResponseBody Body) {
            this.Body = Body;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.Runtime.Serialization.DataContractAttribute(Namespace="http://tempuri.org/")]
    public partial class pronosticoResponseBody {
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false, Order=0)]
        public string pronosticoResult;
        
        public pronosticoResponseBody() {
        }
        
        public pronosticoResponseBody(string pronosticoResult) {
            this.pronosticoResult = pronosticoResult;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class fechasRequest {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Name="fechas", Namespace="http://tempuri.org/", Order=0)]
        public WindowsFormsApp1.ServiceReference1.fechasRequestBody Body;
        
        public fechasRequest() {
        }
        
        public fechasRequest(WindowsFormsApp1.ServiceReference1.fechasRequestBody Body) {
            this.Body = Body;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.Runtime.Serialization.DataContractAttribute()]
    public partial class fechasRequestBody {
        
        public fechasRequestBody() {
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class fechasResponse {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Name="fechasResponse", Namespace="http://tempuri.org/", Order=0)]
        public WindowsFormsApp1.ServiceReference1.fechasResponseBody Body;
        
        public fechasResponse() {
        }
        
        public fechasResponse(WindowsFormsApp1.ServiceReference1.fechasResponseBody Body) {
            this.Body = Body;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.Runtime.Serialization.DataContractAttribute(Namespace="http://tempuri.org/")]
    public partial class fechasResponseBody {
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false, Order=0)]
        public string fechasResult;
        
        public fechasResponseBody() {
        }
        
        public fechasResponseBody(string fechasResult) {
            this.fechasResult = fechasResult;
        }
    }
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public interface OperacionesSoapChannel : WindowsFormsApp1.ServiceReference1.OperacionesSoap, System.ServiceModel.IClientChannel {
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public partial class OperacionesSoapClient : System.ServiceModel.ClientBase<WindowsFormsApp1.ServiceReference1.OperacionesSoap>, WindowsFormsApp1.ServiceReference1.OperacionesSoap {
        
        public OperacionesSoapClient() {
        }
        
        public OperacionesSoapClient(string endpointConfigurationName) : 
                base(endpointConfigurationName) {
        }
        
        public OperacionesSoapClient(string endpointConfigurationName, string remoteAddress) : 
                base(endpointConfigurationName, remoteAddress) {
        }
        
        public OperacionesSoapClient(string endpointConfigurationName, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(endpointConfigurationName, remoteAddress) {
        }
        
        public OperacionesSoapClient(System.ServiceModel.Channels.Binding binding, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(binding, remoteAddress) {
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        WindowsFormsApp1.ServiceReference1.pronosticoResponse WindowsFormsApp1.ServiceReference1.OperacionesSoap.pronostico(WindowsFormsApp1.ServiceReference1.pronosticoRequest request) {
            return base.Channel.pronostico(request);
        }
        
        public string pronostico(string fecha) {
            WindowsFormsApp1.ServiceReference1.pronosticoRequest inValue = new WindowsFormsApp1.ServiceReference1.pronosticoRequest();
            inValue.Body = new WindowsFormsApp1.ServiceReference1.pronosticoRequestBody();
            inValue.Body.fecha = fecha;
            WindowsFormsApp1.ServiceReference1.pronosticoResponse retVal = ((WindowsFormsApp1.ServiceReference1.OperacionesSoap)(this)).pronostico(inValue);
            return retVal.Body.pronosticoResult;
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        System.Threading.Tasks.Task<WindowsFormsApp1.ServiceReference1.pronosticoResponse> WindowsFormsApp1.ServiceReference1.OperacionesSoap.pronosticoAsync(WindowsFormsApp1.ServiceReference1.pronosticoRequest request) {
            return base.Channel.pronosticoAsync(request);
        }
        
        public System.Threading.Tasks.Task<WindowsFormsApp1.ServiceReference1.pronosticoResponse> pronosticoAsync(string fecha) {
            WindowsFormsApp1.ServiceReference1.pronosticoRequest inValue = new WindowsFormsApp1.ServiceReference1.pronosticoRequest();
            inValue.Body = new WindowsFormsApp1.ServiceReference1.pronosticoRequestBody();
            inValue.Body.fecha = fecha;
            return ((WindowsFormsApp1.ServiceReference1.OperacionesSoap)(this)).pronosticoAsync(inValue);
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        WindowsFormsApp1.ServiceReference1.fechasResponse WindowsFormsApp1.ServiceReference1.OperacionesSoap.fechas(WindowsFormsApp1.ServiceReference1.fechasRequest request) {
            return base.Channel.fechas(request);
        }
        
        public string fechas() {
            WindowsFormsApp1.ServiceReference1.fechasRequest inValue = new WindowsFormsApp1.ServiceReference1.fechasRequest();
            inValue.Body = new WindowsFormsApp1.ServiceReference1.fechasRequestBody();
            WindowsFormsApp1.ServiceReference1.fechasResponse retVal = ((WindowsFormsApp1.ServiceReference1.OperacionesSoap)(this)).fechas(inValue);
            return retVal.Body.fechasResult;
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        System.Threading.Tasks.Task<WindowsFormsApp1.ServiceReference1.fechasResponse> WindowsFormsApp1.ServiceReference1.OperacionesSoap.fechasAsync(WindowsFormsApp1.ServiceReference1.fechasRequest request) {
            return base.Channel.fechasAsync(request);
        }
        
        public System.Threading.Tasks.Task<WindowsFormsApp1.ServiceReference1.fechasResponse> fechasAsync() {
            WindowsFormsApp1.ServiceReference1.fechasRequest inValue = new WindowsFormsApp1.ServiceReference1.fechasRequest();
            inValue.Body = new WindowsFormsApp1.ServiceReference1.fechasRequestBody();
            return ((WindowsFormsApp1.ServiceReference1.OperacionesSoap)(this)).fechasAsync(inValue);
        }
    }
}
