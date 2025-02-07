/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the FireBrigadeSignatureInfo service. Represents a row in the &quot;nbp_fire_signature_info&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeSignatureInfoModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeSignatureInfoImpl"
)
@ProviderType
public interface FireBrigadeSignatureInfo
	extends FireBrigadeSignatureInfoModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeSignatureInfoImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<FireBrigadeSignatureInfo, Long>
		FIRE_BRIGADE_SIGNATURE_INFO_ID_ACCESSOR =
			new Accessor<FireBrigadeSignatureInfo, Long>() {

				@Override
				public Long get(
					FireBrigadeSignatureInfo fireBrigadeSignatureInfo) {

					return fireBrigadeSignatureInfo.
						getFireBrigadeSignatureInfoId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<FireBrigadeSignatureInfo> getTypeClass() {
					return FireBrigadeSignatureInfo.class;
				}

			};

}