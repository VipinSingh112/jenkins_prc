/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the AccThirdPartyAppliInfo service. Represents a row in the &quot;nbp_janaac_acc_third_appli&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AccThirdPartyAppliInfoModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.janaac.application.form.service.model.impl.AccThirdPartyAppliInfoImpl"
)
@ProviderType
public interface AccThirdPartyAppliInfo
	extends AccThirdPartyAppliInfoModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.janaac.application.form.service.model.impl.AccThirdPartyAppliInfoImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AccThirdPartyAppliInfo, Long>
		ACC_THIRD_PARTY_APPLI_INFO_ID_ACCESSOR =
			new Accessor<AccThirdPartyAppliInfo, Long>() {

				@Override
				public Long get(AccThirdPartyAppliInfo accThirdPartyAppliInfo) {
					return accThirdPartyAppliInfo.getAccThirdPartyAppliInfoId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<AccThirdPartyAppliInfo> getTypeClass() {
					return AccThirdPartyAppliInfo.class;
				}

			};

}