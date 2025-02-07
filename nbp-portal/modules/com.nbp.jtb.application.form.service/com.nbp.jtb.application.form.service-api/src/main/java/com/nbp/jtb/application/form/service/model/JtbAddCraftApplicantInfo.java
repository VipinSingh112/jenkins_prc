/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the JtbAddCraftApplicantInfo service. Represents a row in the &quot;nbp_jtb_craft_applicant&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see JtbAddCraftApplicantInfoModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.jtb.application.form.service.model.impl.JtbAddCraftApplicantInfoImpl"
)
@ProviderType
public interface JtbAddCraftApplicantInfo
	extends JtbAddCraftApplicantInfoModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.jtb.application.form.service.model.impl.JtbAddCraftApplicantInfoImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<JtbAddCraftApplicantInfo, Long>
		JTB_ADD_CRAFT_APPLICANT_INFO_ID_ACCESSOR =
			new Accessor<JtbAddCraftApplicantInfo, Long>() {

				@Override
				public Long get(
					JtbAddCraftApplicantInfo jtbAddCraftApplicantInfo) {

					return jtbAddCraftApplicantInfo.
						getJtbAddCraftApplicantInfoId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<JtbAddCraftApplicantInfo> getTypeClass() {
					return JtbAddCraftApplicantInfo.class;
				}

			};

}