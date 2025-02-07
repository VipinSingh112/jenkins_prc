/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the ManuCompanyInfo service. Represents a row in the &quot;nbp_manufacture_company_info&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ManuCompanyInfoModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.manufacturing.application.form.service.model.impl.ManuCompanyInfoImpl"
)
@ProviderType
public interface ManuCompanyInfo extends ManuCompanyInfoModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.manufacturing.application.form.service.model.impl.ManuCompanyInfoImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<ManuCompanyInfo, Long>
		MANU_COMPANY_INFO_ID_ACCESSOR = new Accessor<ManuCompanyInfo, Long>() {

			@Override
			public Long get(ManuCompanyInfo manuCompanyInfo) {
				return manuCompanyInfo.getManuCompanyInfoId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<ManuCompanyInfo> getTypeClass() {
				return ManuCompanyInfo.class;
			}

		};

}