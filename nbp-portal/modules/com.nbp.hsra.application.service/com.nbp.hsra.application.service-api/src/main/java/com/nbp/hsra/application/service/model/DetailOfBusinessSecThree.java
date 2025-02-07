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
 * The extended model interface for the DetailOfBusinessSecThree service. Represents a row in the &quot;nbp_hsra_det_business&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see DetailOfBusinessSecThreeModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.hsra.application.service.model.impl.DetailOfBusinessSecThreeImpl"
)
@ProviderType
public interface DetailOfBusinessSecThree
	extends DetailOfBusinessSecThreeModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.hsra.application.service.model.impl.DetailOfBusinessSecThreeImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<DetailOfBusinessSecThree, Long>
		DETAIL_OF_BUSINESS_SEC_THREE_ID_ACCESSOR =
			new Accessor<DetailOfBusinessSecThree, Long>() {

				@Override
				public Long get(
					DetailOfBusinessSecThree detailOfBusinessSecThree) {

					return detailOfBusinessSecThree.
						getDetailOfBusinessSecThreeId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<DetailOfBusinessSecThree> getTypeClass() {
					return DetailOfBusinessSecThree.class;
				}

			};

}