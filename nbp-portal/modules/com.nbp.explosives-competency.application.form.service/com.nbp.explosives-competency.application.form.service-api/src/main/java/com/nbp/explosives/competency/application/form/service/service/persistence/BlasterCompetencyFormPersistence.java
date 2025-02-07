/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.explosives.competency.application.form.service.exception.NoSuchBlasterCompetencyFormException;
import com.nbp.explosives.competency.application.form.service.model.BlasterCompetencyForm;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the blaster competency form service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BlasterCompetencyFormUtil
 * @generated
 */
@ProviderType
public interface BlasterCompetencyFormPersistence
	extends BasePersistence<BlasterCompetencyForm> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BlasterCompetencyFormUtil} to access the blaster competency form persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the blaster competency form where explosivesApplicationId = &#63; or throws a <code>NoSuchBlasterCompetencyFormException</code> if it could not be found.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the matching blaster competency form
	 * @throws NoSuchBlasterCompetencyFormException if a matching blaster competency form could not be found
	 */
	public BlasterCompetencyForm findBygetExplosiveById(
			long explosivesApplicationId)
		throws NoSuchBlasterCompetencyFormException;

	/**
	 * Returns the blaster competency form where explosivesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the matching blaster competency form, or <code>null</code> if a matching blaster competency form could not be found
	 */
	public BlasterCompetencyForm fetchBygetExplosiveById(
		long explosivesApplicationId);

	/**
	 * Returns the blaster competency form where explosivesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching blaster competency form, or <code>null</code> if a matching blaster competency form could not be found
	 */
	public BlasterCompetencyForm fetchBygetExplosiveById(
		long explosivesApplicationId, boolean useFinderCache);

	/**
	 * Removes the blaster competency form where explosivesApplicationId = &#63; from the database.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the blaster competency form that was removed
	 */
	public BlasterCompetencyForm removeBygetExplosiveById(
			long explosivesApplicationId)
		throws NoSuchBlasterCompetencyFormException;

	/**
	 * Returns the number of blaster competency forms where explosivesApplicationId = &#63;.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the number of matching blaster competency forms
	 */
	public int countBygetExplosiveById(long explosivesApplicationId);

	/**
	 * Caches the blaster competency form in the entity cache if it is enabled.
	 *
	 * @param blasterCompetencyForm the blaster competency form
	 */
	public void cacheResult(BlasterCompetencyForm blasterCompetencyForm);

	/**
	 * Caches the blaster competency forms in the entity cache if it is enabled.
	 *
	 * @param blasterCompetencyForms the blaster competency forms
	 */
	public void cacheResult(
		java.util.List<BlasterCompetencyForm> blasterCompetencyForms);

	/**
	 * Creates a new blaster competency form with the primary key. Does not add the blaster competency form to the database.
	 *
	 * @param blasterCompetencyFormId the primary key for the new blaster competency form
	 * @return the new blaster competency form
	 */
	public BlasterCompetencyForm create(long blasterCompetencyFormId);

	/**
	 * Removes the blaster competency form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param blasterCompetencyFormId the primary key of the blaster competency form
	 * @return the blaster competency form that was removed
	 * @throws NoSuchBlasterCompetencyFormException if a blaster competency form with the primary key could not be found
	 */
	public BlasterCompetencyForm remove(long blasterCompetencyFormId)
		throws NoSuchBlasterCompetencyFormException;

	public BlasterCompetencyForm updateImpl(
		BlasterCompetencyForm blasterCompetencyForm);

	/**
	 * Returns the blaster competency form with the primary key or throws a <code>NoSuchBlasterCompetencyFormException</code> if it could not be found.
	 *
	 * @param blasterCompetencyFormId the primary key of the blaster competency form
	 * @return the blaster competency form
	 * @throws NoSuchBlasterCompetencyFormException if a blaster competency form with the primary key could not be found
	 */
	public BlasterCompetencyForm findByPrimaryKey(long blasterCompetencyFormId)
		throws NoSuchBlasterCompetencyFormException;

	/**
	 * Returns the blaster competency form with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param blasterCompetencyFormId the primary key of the blaster competency form
	 * @return the blaster competency form, or <code>null</code> if a blaster competency form with the primary key could not be found
	 */
	public BlasterCompetencyForm fetchByPrimaryKey(
		long blasterCompetencyFormId);

	/**
	 * Returns all the blaster competency forms.
	 *
	 * @return the blaster competency forms
	 */
	public java.util.List<BlasterCompetencyForm> findAll();

	/**
	 * Returns a range of all the blaster competency forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BlasterCompetencyFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of blaster competency forms
	 * @param end the upper bound of the range of blaster competency forms (not inclusive)
	 * @return the range of blaster competency forms
	 */
	public java.util.List<BlasterCompetencyForm> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the blaster competency forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BlasterCompetencyFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of blaster competency forms
	 * @param end the upper bound of the range of blaster competency forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of blaster competency forms
	 */
	public java.util.List<BlasterCompetencyForm> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BlasterCompetencyForm>
			orderByComparator);

	/**
	 * Returns an ordered range of all the blaster competency forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BlasterCompetencyFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of blaster competency forms
	 * @param end the upper bound of the range of blaster competency forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of blaster competency forms
	 */
	public java.util.List<BlasterCompetencyForm> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BlasterCompetencyForm>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the blaster competency forms from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of blaster competency forms.
	 *
	 * @return the number of blaster competency forms
	 */
	public int countAll();

}