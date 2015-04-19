using System.ServiceModel;
using System.ServiceModel.Web;

namespace RestService
{
    
    [ServiceContract]
    public interface IRestServiceImpl
    {
       //call the service by URL - http://localhost:58907/RestServiceImpl.svc/xml/123
        [OperationContract]
        [WebInvoke(Method = "GET",
            ResponseFormat = WebMessageFormat.Xml,
            BodyStyle = WebMessageBodyStyle.Wrapped,
            UriTemplate = "xml/{id}")]
        string XMLData(string id);

        //call the service by URL - http://localhost:58907/RestServiceImpl.svc/json/123
        [OperationContract]
        [WebInvoke(Method = "GET",
            ResponseFormat = WebMessageFormat.Json,
            BodyStyle = WebMessageBodyStyle.Wrapped,
            UriTemplate = "json/{id}")]
        string JSONData(string id);
    }
}