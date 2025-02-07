/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAddCerScopeServiceThirdException;
import com.nbp.janaac.application.form.service.model.AddCerScopeServiceThird;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the add cer scope service third service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddCerScopeServiceThirdUtil
 * @generated
 */
@ProviderType
public interface AddCerScopeServiceThirdPersistence
	extends BasePersistence<AddCerScopeServiceThird> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AddCerScopeServiceThirdUtil} to access the add cer scope service third persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the add cer scope service thirds where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add cer scope service thirds
	 */
	public java.util.List<AddCerScopeServiceThird> findBygetJanaacById(
		long janaacApplicationId);

	/**
	 * Returns a range of all the add cer scope service thirds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerScopeServiceThirdModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add cer scope service thirds
	 * @param end the upper bound of the range of add cer scope service thirds (not inclusive)
	 * @return the range of matching add cer scope service thirds
	 */
	public java.util.List<AddCerScopeServiceThird> findBygetJanaacById(
		long janaacApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the add cer scope service thirds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerScopeServiceThirdModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add cer scope service thirds
	 * @param end the upper bound of the range of add cer scope service thirds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add cer scope service thirds
	 */
	public java.util.List<AddCerScopeServiceThird> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddCerScopeServiceThird> orderByComparator);

	/**
	 * Returns an ordered range of all the add cer scope service thirds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerScopeServiceThirdModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add cer scope service thirds
	 * @param end the upper bound of the range of add cer scope service thirds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add cer scope service thirds
	 */
	public java.util.List<AddCerScopeServiceThird> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddCerScopeServiceThird> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first add cer scope service third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add cer scope service third
	 * @throws NoSuchAddCerScopeServiceThirdException if a matching add cer scope service third could not be found
	 */
	public AddCerScopeServiceThird findBygetJanaacById_First(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddCerScopeServiceThird> orderByComparator)
		throws NoSuchAddCerScopeServiceThirdException;

	/**
	 * Returns the first add cer scope service third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add cer scope service third, or <code>null</code> if a matching add cer scope service third could not be found
	 */
	public AddCerScopeServiceThird fetchBygetJanaacById_First(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddCerScopeServiceThird> orderByComparator);

	/**
	 * Returns the last add cer scope service third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add cer scope service third
	 * @throws NoSuchAddCerScopeServiceThirdException if a matching add cer scope service third could not be found
	 */
	public AddCerScopeServiceThird findBygetJanaacById_Last(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddCerScopeServiceThird> orderByComparator)
		throws NoSuchAddCerScopeServiceThirdException;

	/**
	 * Returns the last add cer scope service third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add cer scope service third, or <code>null</code> if a matching add cer scope service third could not be found
	 */
	public AddCerScopeServiceThird fetchBygetJanaacById_Last(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddCerScopeServiceThird> orderByComparator);

	/**
	 * Returns the add cer scope service thirds before and after the current add cer scope service third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addCerScopeServiceThirdId the primary key of the current add cer scope service third
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add cer scope service third
	 * @throws NoSuchAddCerScopeServiceThirdException if a add cer scope service third with the primary key could not be found
	 */
	public AddCerScopeServiceThird[] findBygetJanaacById_PrevAndNext(
			long addCerScopeServiceThirdId, long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddCerScopeServiceThird> orderByComparator)
		throws NoSuchAddCerScopeServiceThirdException;

	/**
	 * Removes all the add cer scope service thirds where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public void removeBygetJanaacById(long janaacApplicationId);

	/**
	 * Returns the number of add cer scope service thirds where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add cer scope service thirds
	 */
	public int countBygetJanaacById(long janaacApplicationId);

	/**
	 * Caches the add cer scope service third in the entity cache if it is enabled.
	 *
	 * @param addCerScopeServiceThird the add cer scope service third
	 */
	public void cacheResult(AddCerScopeServiceThird addCerScopeServiceThird);

	/**
	 * Caches the add cer scope service thirds in the entity cache if it is enabled.
	 *
	 * @param addCerScopeServiceThirds the add cer scope service thirds
	 */
	public void cacheResult(
		java.util.List<AddCerScopeServiceThird> addCerScopeServiceThirds);

	/**
	 * Creates a new add cer scope service third with the primary key. Does not add the add cer scope service third to the database.
	 *
	 * @param addCerScopeServiceThirdId the primary key for the new add cer scope service third
	 * @return the new add cer scope service third
	 */
	public AddCerScopeServiceThird create(long addCerScopeServiceThirdId);

	/**
	 * Removes the add cer scope service third with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addCerScopeServiceThirdId the primary key of the add cer scope service third
	 * @return the add cer scope service third that was removed
	 * @throws NoSuchAddCerScopeServiceThirdException if a add cer scope service third with the primary key could not be found
	 */
	public AddCerScopeServiceThird remove(long addCerScopeServiceThirdId)
		throws NoSuchAddCerScopeServiceThirdException;

	public AddCerScopeServiceThird updateImpl(
		AddCerScopeServiceThird addCerScopeServiceThird);

	/**
	 * Returns the add cer scope service third with the primary key or throws a <code>NoSuchAddCerScopeServiceThirdException</code> if it could not be found.
	 *
	 * @param addCerScopeServiceThirdId the primary key of the add cer scope service third
	 * @return the add cer scope service third
	 * @throws NoSuchAddCerScopeServiceThirdException if a add cer scope service third with the primary key could not be found
	 */
	public AddCerScopeServiceThird findByPrimaryKey(
			long addCerScopeServiceThirdId)
		throws NoSuchAddCerScopeServiceThirdException;

	/**
	 * Returns the add cer scope service third with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addCerScopeServiceThirdId the primary key of the add cer scope service third
	 * @return the add cer scope service third, or <code>null</code> if a add cer scope service third with the primary key could not be found
	 */
	public AddCerScopeServiceThird fetchByPrimaryKey(
		long addCerScopeServiceThirdId);

	/**
	 * Returns all the add cer scope service thirds.
	 *
	 * @return the add cer scope service thirds
	 */
	public java.util.List<AddCerScopeServiceThird> findAll();

	/**
	 * Returns a range of all the add cer scope service thirds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerScopeServiceThirdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer scope service thirds
	 * @param end the upper bound of the range of add cer scope service thirds (not inclusive)
	 * @return the range of add cer scope service thirds
	 */
	public java.util.List<AddCerScopeServiceThird> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the add cer scope service thirds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerScopeServiceThirdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer scope service thirds
	 * @param end the upper bound of the range of add cer scope service thirds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add cer scope service thirds
	 */
	public java.util.List<AddCerScopeServiceThird> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddCerScopeServiceThird> orderByComparator);

	/**
	 * Returns an ordered range of all the add cer scope service thirds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerScopeServiceThirdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer scope service thirds
	 * @param end the upper bound of the range of add cer scope service thirds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add cer scope service thirds
	 */
	public java.util.List<AddCerScopeServiceThird> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddCerScopeServiceThird> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the add cer scope service thirds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of add cer scope service thirds.
	 *
	 * @return the number of add cer scope service thirds
	 */
	public int countAll();

}