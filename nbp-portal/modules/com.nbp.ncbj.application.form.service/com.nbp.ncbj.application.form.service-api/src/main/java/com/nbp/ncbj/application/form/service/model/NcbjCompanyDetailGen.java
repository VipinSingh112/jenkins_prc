/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the NcbjCompanyDetailGen service. Represents a row in the &quot;nbp_ncbj_company_det_gen&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjCompanyDetailGenModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.ncbj.application.form.service.model.impl.NcbjCompanyDetailGenImpl"
)
@ProviderType
public interface NcbjCompanyDetailGen
	extends NcbjCompanyDetailGenModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.ncbj.application.form.service.model.impl.NcbjCompanyDetailGenImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<NcbjCompanyDetailGen, Long>
		NCBJ_COMPANY_DETAIL_GEN_ID_ACCESSOR =
			new Accessor<NcbjCompanyDetailGen, Long>() {

				@Override
				public Long get(NcbjCompanyDetailGen ncbjCompanyDetailGen) {
					return ncbjCompanyDetailGen.getNcbjCompanyDetailGenId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<NcbjCompanyDetailGen> getTypeClass() {
					return NcbjCompanyDetailGen.class;
				}

			};

}