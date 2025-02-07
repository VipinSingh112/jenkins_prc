/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the BrokerDeclarationInfo service. Represents a row in the &quot;nbp_hsra_broker_declare&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see BrokerDeclarationInfoModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.hsra.application.service.model.impl.BrokerDeclarationInfoImpl"
)
@ProviderType
public interface BrokerDeclarationInfo
	extends BrokerDeclarationInfoModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.hsra.application.service.model.impl.BrokerDeclarationInfoImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<BrokerDeclarationInfo, Long>
		BROKER_DECLARE_INFO_ID_ACCESSOR =
			new Accessor<BrokerDeclarationInfo, Long>() {

				@Override
				public Long get(BrokerDeclarationInfo brokerDeclarationInfo) {
					return brokerDeclarationInfo.getBrokerDeclareInfoId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<BrokerDeclarationInfo> getTypeClass() {
					return BrokerDeclarationInfo.class;
				}

			};

}