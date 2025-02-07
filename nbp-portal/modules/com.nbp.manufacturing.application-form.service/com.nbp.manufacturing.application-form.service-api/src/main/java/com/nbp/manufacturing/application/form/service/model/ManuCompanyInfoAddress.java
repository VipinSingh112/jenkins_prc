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
 * The extended model interface for the ManuCompanyInfoAddress service. Represents a row in the &quot;nbp_manu_com_Info_Address&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ManuCompanyInfoAddressModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.manufacturing.application.form.service.model.impl.ManuCompanyInfoAddressImpl"
)
@ProviderType
public interface ManuCompanyInfoAddress
	extends ManuCompanyInfoAddressModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.manufacturing.application.form.service.model.impl.ManuCompanyInfoAddressImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<ManuCompanyInfoAddress, Long>
		MANU_COMPANY_INFO_ADDRESS_ID_ACCESSOR =
			new Accessor<ManuCompanyInfoAddress, Long>() {

				@Override
				public Long get(ManuCompanyInfoAddress manuCompanyInfoAddress) {
					return manuCompanyInfoAddress.getManuCompanyInfoAddressId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<ManuCompanyInfoAddress> getTypeClass() {
					return ManuCompanyInfoAddress.class;
				}

			};

}