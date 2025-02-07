/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAddFdaPersonnelThirdException;
import com.nbp.janaac.application.form.service.model.AddFdaPersonnelThird;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the add fda personnel third service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddFdaPersonnelThirdUtil
 * @generated
 */
@ProviderType
public interface AddFdaPersonnelThirdPersistence
	extends BasePersistence<AddFdaPersonnelThird> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AddFdaPersonnelThirdUtil} to access the add fda personnel third persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the add fda personnel thirds where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add fda personnel thirds
	 */
	public java.util.List<AddFdaPersonnelThird> findBygetJanaacById(
		long janaacApplicationId);

	/**
	 * Returns a range of all the add fda personnel thirds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelThirdModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add fda personnel thirds
	 * @param end the upper bound of the range of add fda personnel thirds (not inclusive)
	 * @return the range of matching add fda personnel thirds
	 */
	public java.util.List<AddFdaPersonnelThird> findBygetJanaacById(
		long janaacApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the add fda personnel thirds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelThirdModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add fda personnel thirds
	 * @param end the upper bound of the range of add fda personnel thirds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add fda personnel thirds
	 */
	public java.util.List<AddFdaPersonnelThird> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddFdaPersonnelThird>
			orderByComparator);

	/**
	 * Returns an ordered range of all the add fda personnel thirds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelThirdModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add fda personnel thirds
	 * @param end the upper bound of the range of add fda personnel thirds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add fda personnel thirds
	 */
	public java.util.List<AddFdaPersonnelThird> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddFdaPersonnelThird>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first add fda personnel third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add fda personnel third
	 * @throws NoSuchAddFdaPersonnelThirdException if a matching add fda personnel third could not be found
	 */
	public AddFdaPersonnelThird findBygetJanaacById_First(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddFdaPersonnelThird> orderByComparator)
		throws NoSuchAddFdaPersonnelThirdException;

	/**
	 * Returns the first add fda personnel third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add fda personnel third, or <code>null</code> if a matching add fda personnel third could not be found
	 */
	public AddFdaPersonnelThird fetchBygetJanaacById_First(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AddFdaPersonnelThird>
			orderByComparator);

	/**
	 * Returns the last add fda personnel third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add fda personnel third
	 * @throws NoSuchAddFdaPersonnelThirdException if a matching add fda personnel third could not be found
	 */
	public AddFdaPersonnelThird findBygetJanaacById_Last(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddFdaPersonnelThird> orderByComparator)
		throws NoSuchAddFdaPersonnelThirdException;

	/**
	 * Returns the last add fda personnel third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add fda personnel third, or <code>null</code> if a matching add fda personnel third could not be found
	 */
	public AddFdaPersonnelThird fetchBygetJanaacById_Last(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AddFdaPersonnelThird>
			orderByComparator);

	/**
	 * Returns the add fda personnel thirds before and after the current add fda personnel third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addFdaPersonnelThirdId the primary key of the current add fda personnel third
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add fda personnel third
	 * @throws NoSuchAddFdaPersonnelThirdException if a add fda personnel third with the primary key could not be found
	 */
	public AddFdaPersonnelThird[] findBygetJanaacById_PrevAndNext(
			long addFdaPersonnelThirdId, long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddFdaPersonnelThird> orderByComparator)
		throws NoSuchAddFdaPersonnelThirdException;

	/**
	 * Removes all the add fda personnel thirds where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public void removeBygetJanaacById(long janaacApplicationId);

	/**
	 * Returns the number of add fda personnel thirds where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add fda personnel thirds
	 */
	public int countBygetJanaacById(long janaacApplicationId);

	/**
	 * Caches the add fda personnel third in the entity cache if it is enabled.
	 *
	 * @param addFdaPersonnelThird the add fda personnel third
	 */
	public void cacheResult(AddFdaPersonnelThird addFdaPersonnelThird);

	/**
	 * Caches the add fda personnel thirds in the entity cache if it is enabled.
	 *
	 * @param addFdaPersonnelThirds the add fda personnel thirds
	 */
	public void cacheResult(
		java.util.List<AddFdaPersonnelThird> addFdaPersonnelThirds);

	/**
	 * Creates a new add fda personnel third with the primary key. Does not add the add fda personnel third to the database.
	 *
	 * @param addFdaPersonnelThirdId the primary key for the new add fda personnel third
	 * @return the new add fda personnel third
	 */
	public AddFdaPersonnelThird create(long addFdaPersonnelThirdId);

	/**
	 * Removes the add fda personnel third with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addFdaPersonnelThirdId the primary key of the add fda personnel third
	 * @return the add fda personnel third that was removed
	 * @throws NoSuchAddFdaPersonnelThirdException if a add fda personnel third with the primary key could not be found
	 */
	public AddFdaPersonnelThird remove(long addFdaPersonnelThirdId)
		throws NoSuchAddFdaPersonnelThirdException;

	public AddFdaPersonnelThird updateImpl(
		AddFdaPersonnelThird addFdaPersonnelThird);

	/**
	 * Returns the add fda personnel third with the primary key or throws a <code>NoSuchAddFdaPersonnelThirdException</code> if it could not be found.
	 *
	 * @param addFdaPersonnelThirdId the primary key of the add fda personnel third
	 * @return the add fda personnel third
	 * @throws NoSuchAddFdaPersonnelThirdException if a add fda personnel third with the primary key could not be found
	 */
	public AddFdaPersonnelThird findByPrimaryKey(long addFdaPersonnelThirdId)
		throws NoSuchAddFdaPersonnelThirdException;

	/**
	 * Returns the add fda personnel third with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addFdaPersonnelThirdId the primary key of the add fda personnel third
	 * @return the add fda personnel third, or <code>null</code> if a add fda personnel third with the primary key could not be found
	 */
	public AddFdaPersonnelThird fetchByPrimaryKey(long addFdaPersonnelThirdId);

	/**
	 * Returns all the add fda personnel thirds.
	 *
	 * @return the add fda personnel thirds
	 */
	public java.util.List<AddFdaPersonnelThird> findAll();

	/**
	 * Returns a range of all the add fda personnel thirds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelThirdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda personnel thirds
	 * @param end the upper bound of the range of add fda personnel thirds (not inclusive)
	 * @return the range of add fda personnel thirds
	 */
	public java.util.List<AddFdaPersonnelThird> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the add fda personnel thirds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelThirdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda personnel thirds
	 * @param end the upper bound of the range of add fda personnel thirds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add fda personnel thirds
	 */
	public java.util.List<AddFdaPersonnelThird> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddFdaPersonnelThird>
			orderByComparator);

	/**
	 * Returns an ordered range of all the add fda personnel thirds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelThirdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda personnel thirds
	 * @param end the upper bound of the range of add fda personnel thirds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add fda personnel thirds
	 */
	public java.util.List<AddFdaPersonnelThird> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddFdaPersonnelThird>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the add fda personnel thirds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of add fda personnel thirds.
	 *
	 * @return the number of add fda personnel thirds
	 */
	public int countAll();

}