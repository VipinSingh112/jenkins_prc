/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.model.impl;

import com.nbp.film.application.form.service.model.FilmAdditionalEquipmentList;
import com.nbp.film.application.form.service.service.FilmAdditionalEquipmentListLocalServiceUtil;

/**
 * The extended model base implementation for the FilmAdditionalEquipmentList service. Represents a row in the &quot;nbp_film_additional_equip_list&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FilmAdditionalEquipmentListImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FilmAdditionalEquipmentListImpl
 * @see FilmAdditionalEquipmentList
 * @generated
 */
public abstract class FilmAdditionalEquipmentListBaseImpl
	extends FilmAdditionalEquipmentListModelImpl
	implements FilmAdditionalEquipmentList {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a film additional equipment list model instance should use the <code>FilmAdditionalEquipmentList</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			FilmAdditionalEquipmentListLocalServiceUtil.
				addFilmAdditionalEquipmentList(this);
		}
		else {
			FilmAdditionalEquipmentListLocalServiceUtil.
				updateFilmAdditionalEquipmentList(this);
		}
	}

}