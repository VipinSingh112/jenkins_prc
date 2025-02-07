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
 * The extended model interface for the NcraVerifyWeighingDate service. Represents a row in the &quot;nbp_ncra_veri_weigh_date&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see NcraVerifyWeighingDateModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.ncra.application.form.service.model.impl.NcraVerifyWeighingDateImpl"
)
@ProviderType
public interface NcraVerifyWeighingDate
	extends NcraVerifyWeighingDateModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.ncra.application.form.service.model.impl.NcraVerifyWeighingDateImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<NcraVerifyWeighingDate, Long>
		NCRA_VERIFY_WEIGHING_DATE_ID_ACCESSOR =
			new Accessor<NcraVerifyWeighingDate, Long>() {

				@Override
				public Long get(NcraVerifyWeighingDate ncraVerifyWeighingDate) {
					return ncraVerifyWeighingDate.getNcraVerifyWeighingDateId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<NcraVerifyWeighingDate> getTypeClass() {
					return NcraVerifyWeighingDate.class;
				}

			};

}