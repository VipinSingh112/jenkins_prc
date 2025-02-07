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
 * The extended model interface for the NcbjSectionFour service. Represents a row in the &quot;nbp_ncbj_section_four&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSectionFourModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.ncbj.application.form.service.model.impl.NcbjSectionFourImpl"
)
@ProviderType
public interface NcbjSectionFour extends NcbjSectionFourModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.ncbj.application.form.service.model.impl.NcbjSectionFourImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<NcbjSectionFour, Long>
		NCBJ_SECTION_FOUR_ID_ACCESSOR = new Accessor<NcbjSectionFour, Long>() {

			@Override
			public Long get(NcbjSectionFour ncbjSectionFour) {
				return ncbjSectionFour.getNcbjSectionFourId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<NcbjSectionFour> getTypeClass() {
				return NcbjSectionFour.class;
			}

		};

}