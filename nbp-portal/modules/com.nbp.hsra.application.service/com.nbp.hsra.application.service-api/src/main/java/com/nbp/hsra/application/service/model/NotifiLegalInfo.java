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
 * The extended model interface for the NotifiLegalInfo service. Represents a row in the &quot;nbp_hsra_noti_legal_info&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see NotifiLegalInfoModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.hsra.application.service.model.impl.NotifiLegalInfoImpl"
)
@ProviderType
public interface NotifiLegalInfo extends NotifiLegalInfoModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.hsra.application.service.model.impl.NotifiLegalInfoImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<NotifiLegalInfo, Long>
		NOTIFI_LEGAL_INFO_ID_ACCESSOR = new Accessor<NotifiLegalInfo, Long>() {

			@Override
			public Long get(NotifiLegalInfo notifiLegalInfo) {
				return notifiLegalInfo.getNotifiLegalInfoId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<NotifiLegalInfo> getTypeClass() {
				return NotifiLegalInfo.class;
			}

		};

}