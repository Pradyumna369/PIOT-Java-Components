/**
 * This class is part of the Programming the Internet of Things project.
 * 
 * It is provided as a simple shell to guide the student and assist with
 * implementation for the Programming the Internet of Things exercises,
 * and designed to be modified by the student as needed.
 */ 

package programmingtheiot.gda.connection;

import java.util.logging.Level;
import java.util.logging.Logger;

import programmingtheiot.common.ConfigConst;
import programmingtheiot.common.ConfigUtil;
import programmingtheiot.common.IDataMessageListener;
import programmingtheiot.common.ResourceNameEnum;
import programmingtheiot.data.SensorData;
import programmingtheiot.data.SystemPerformanceData;

/**
 * Shell representation of class for student implementation.
 *
 */
public class CloudClientConnector implements ICloudClient
{
	// static
	
	private static final Logger _Logger =
		Logger.getLogger(CloudClientConnector.class.getName());
	
	// private var's
	private String topicPrefix = "";
	private MqttClientConnector mqttClient = null;
	private IDataMessageListener dataMsgListener = null;

	// TODO: set to either 0 or 1, depending on which is preferred for your implementation
	private int qosLevel = 1;
	
	// constructors
	
	/**
	 * Default.
	 * 
	 */
	public CloudClientConnector()
	{
		ConfigUtil configUtil = ConfigUtil.getInstance();
		
		this.topicPrefix =
			configUtil.getProperty(ConfigConst.CLOUD_GATEWAY_SERVICE, ConfigConst.BASE_TOPIC_KEY);
		
		// Depending on the cloud service, the topic names may or may not begin with a "/", so this code
		// should be updated according to the cloud service provider's topic naming conventions
		if (topicPrefix == null) {
			topicPrefix = "/";
		} else {
			if (! topicPrefix.endsWith("/")) {
				topicPrefix += "/";
			}
		}
	}
	
	
	// public methods
	
	@Override
	public boolean connectClient()
	{
		return false;
	}

	@Override
	public boolean disconnectClient()
	{
		return false;
	}

	@Override
	public boolean setDataMessageListener(IDataMessageListener listener)
	{
		return false;
	}

	@Override
	public boolean sendEdgeDataToCloud(ResourceNameEnum resource, SensorData data)
	{
		return false;
	}

	@Override
	public boolean sendEdgeDataToCloud(ResourceNameEnum resource, SystemPerformanceData data)
	{
		return false;
	}

	@Override
	public boolean subscribeToCloudEvents(ResourceNameEnum resource)
	{
		return false;
	}

	@Override
	public boolean unsubscribeFromCloudEvents(ResourceNameEnum resource)
	{
		return false;
	}
	
	
	// private methods
	
	
}
