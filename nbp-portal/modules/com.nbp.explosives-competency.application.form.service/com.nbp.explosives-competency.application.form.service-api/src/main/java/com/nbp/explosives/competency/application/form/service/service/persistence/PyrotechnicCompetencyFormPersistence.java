/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.explosives.competency.application.form.service.exception.NoSuchPyrotechnicCompetencyFormException;
import com.nbp.explosives.competency.application.form.service.model.PyrotechnicCompetencyForm;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the pyrotechnic competency form service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PyrotechnicCompetencyFormUtil
 * @generated
 */
@ProviderType
public interface PyrotechnicCompetencyFormPersistence
	extends BasePersistence<PyrotechnicCompetencyForm> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PyrotechnicCompetencyFormUtil} to access the pyrotechnic competency form persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the pyrotechnic competency form where explosivesApplicationId = &#63; or throws a <code>NoSuchPyrotechnicCompetencyFormException</code> if it could not be found.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the matching pyrotechnic competency form
	 * @throws NoSuchPyrotechnicCompetencyFormException if a matching pyrotechnic competency form could not be found
	 */
	public PyrotechnicCompetencyForm findBygetExplosiveById(
			long explosivesApplicationId)
		throws NoSuchPyrotechnicCompetencyFormException;

	/**
	 * Returns the pyrotechnic competency form where explosivesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the matching pyrotechnic competency form, or <code>null</code> if a matching pyrotechnic competency form could not be found
	 */
	public PyrotechnicCompetencyForm fetchBygetExplosiveById(
		long explosivesApplicationId);

	/**
	 * Returns the pyrotechnic competency form where explosivesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pyrotechnic competency form, or <code>null</code> if a matching pyrotechnic competency form could not be found
	 */
	public PyrotechnicCompetencyForm fetchBygetExplosiveById(
		long explosivesApplicationId, boolean useFinderCache);

	/**
	 * Removes the pyrotechnic competency form where explosivesApplicationId = &#63; from the database.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the pyrotechnic competency form that was removed
	 */
	public PyrotechnicCompetencyForm removeBygetExplosiveById(
			long explosivesApplicationId)
		throws NoSuchPyrotechnicCompetencyFormException;

	/**
	 * Returns the number of pyrotechnic competency forms where explosivesApplicationId = &#63;.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the number of matching pyrotechnic competency forms
	 */
	public int countBygetExplosiveById(long explosivesApplicationId);

	/**
	 * Caches the pyrotechnic competency form in the entity cache if it is enabled.
	 *
	 * @param pyrotechnicCompetencyForm the pyrotechnic competency form
	 */
	public void cacheResult(
		PyrotechnicCompetencyForm pyrotechnicCompetencyForm);

	/**
	 * Caches the pyrotechnic competency forms in the entity cache if it is enabled.
	 *
	 * @param pyrotechnicCompetencyForms the pyrotechnic competency forms
	 */
	public void cacheResult(
		java.util.List<PyrotechnicCompetencyForm> pyrotechnicCompetencyForms);

	/**
	 * Creates a new pyrotechnic competency form with the primary key. Does not add the pyrotechnic competency form to the database.
	 *
	 * @param pyrotechnicCompetencyFormId the primary key for the new pyrotechnic competency form
	 * @return the new pyrotechnic competency form
	 */
	public PyrotechnicCompetencyForm create(long pyrotechnicCompetencyFormId);

	/**
	 * Removes the pyrotechnic competency form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pyrotechnicCompetencyFormId the primary key of the pyrotechnic competency form
	 * @return the pyrotechnic competency form that was removed
	 * @throws NoSuchPyrotechnicCompetencyFormException if a pyrotechnic competency form with the primary key could not be found
	 */
	public PyrotechnicCompetencyForm remove(long pyrotechnicCompetencyFormId)
		throws NoSuchPyrotechnicCompetencyFormException;

	public PyrotechnicCompetencyForm updateImpl(
		PyrotechnicCompetencyForm pyrotechnicCompetencyForm);

	/**
	 * Returns the pyrotechnic competency form with the primary key or throws a <code>NoSuchPyrotechnicCompetencyFormException</code> if it could not be found.
	 *
	 * @param pyrotechnicCompetencyFormId the primary key of the pyrotechnic competency form
	 * @return the pyrotechnic competency form
	 * @throws NoSuchPyrotechnicCompetencyFormException if a pyrotechnic competency form with the primary key could not be found
	 */
	public PyrotechnicCompetencyForm findByPrimaryKey(
			long pyrotechnicCompetencyFormId)
		throws NoSuchPyrotechnicCompetencyFormException;

	/**
	 * Returns the pyrotechnic competency form with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pyrotechnicCompetencyFormId the primary key of the pyrotechnic competency form
	 * @return the pyrotechnic competency form, or <code>null</code> if a pyrotechnic competency form with the primary key could not be found
	 */
	public PyrotechnicCompetencyForm fetchByPrimaryKey(
		long pyrotechnicCompetencyFormId);

	/**
	 * Returns all the pyrotechnic competency forms.
	 *
	 * @return the pyrotechnic competency forms
	 */
	public java.util.List<PyrotechnicCompetencyForm> findAll();

	/**
	 * Returns a range of all the pyrotechnic competency forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PyrotechnicCompetencyFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pyrotechnic competency forms
	 * @param end the upper bound of the range of pyrotechnic competency forms (not inclusive)
	 * @return the range of pyrotechnic competency forms
	 */
	public java.util.List<PyrotechnicCompetencyForm> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the pyrotechnic competency forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PyrotechnicCompetencyFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pyrotechnic competency forms
	 * @param end the upper bound of the range of pyrotechnic competency forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pyrotechnic competency forms
	 */
	public java.util.List<PyrotechnicCompetencyForm> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<PyrotechnicCompetencyForm> orderByComparator);

	/**
	 * Returns an ordered range of all the pyrotechnic competency forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PyrotechnicCompetencyFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pyrotechnic competency forms
	 * @param end the upper bound of the range of pyrotechnic competency forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pyrotechnic competency forms
	 */
	public java.util.List<PyrotechnicCompetencyForm> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<PyrotechnicCompetencyForm> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the pyrotechnic competency forms from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of pyrotechnic competency forms.
	 *
	 * @return the number of pyrotechnic competency forms
	 */
	public int countAll();

}