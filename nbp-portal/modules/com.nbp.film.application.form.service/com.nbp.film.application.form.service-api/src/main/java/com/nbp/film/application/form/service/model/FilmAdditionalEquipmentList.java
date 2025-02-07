/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the FilmAdditionalEquipmentList service. Represents a row in the &quot;nbp_film_additional_equip_list&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see FilmAdditionalEquipmentListModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.film.application.form.service.model.impl.FilmAdditionalEquipmentListImpl"
)
@ProviderType
public interface FilmAdditionalEquipmentList
	extends FilmAdditionalEquipmentListModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.film.application.form.service.model.impl.FilmAdditionalEquipmentListImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<FilmAdditionalEquipmentList, Long>
		FILM_ADDITIONAL_EQUIPMENT_LIST_ID_ACCESSOR =
			new Accessor<FilmAdditionalEquipmentList, Long>() {

				@Override
				public Long get(
					FilmAdditionalEquipmentList filmAdditionalEquipmentList) {

					return filmAdditionalEquipmentList.
						getFilmAdditionalEquipmentListId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<FilmAdditionalEquipmentList> getTypeClass() {
					return FilmAdditionalEquipmentList.class;
				}

			};

}