/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the NcraVerifyWeighingDeviceInfo service. Represents a row in the &quot;nbp_ncra_verify_weigh_info&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see NcraVerifyWeighingDeviceInfoModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.ncra.application.form.service.model.impl.NcraVerifyWeighingDeviceInfoImpl"
)
@ProviderType
public interface NcraVerifyWeighingDeviceInfo
	extends NcraVerifyWeighingDeviceInfoModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.ncra.application.form.service.model.impl.NcraVerifyWeighingDeviceInfoImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<NcraVerifyWeighingDeviceInfo, Long>
		NCRA_VERIFY_WEIGHING_DEVICE_INFO_ID_ACCESSOR =
			new Accessor<NcraVerifyWeighingDeviceInfo, Long>() {

				@Override
				public Long get(
					NcraVerifyWeighingDeviceInfo ncraVerifyWeighingDeviceInfo) {

					return ncraVerifyWeighingDeviceInfo.
						getNcraVerifyWeighingDeviceInfoId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<NcraVerifyWeighingDeviceInfo> getTypeClass() {
					return NcraVerifyWeighingDeviceInfo.class;
				}

			};

}