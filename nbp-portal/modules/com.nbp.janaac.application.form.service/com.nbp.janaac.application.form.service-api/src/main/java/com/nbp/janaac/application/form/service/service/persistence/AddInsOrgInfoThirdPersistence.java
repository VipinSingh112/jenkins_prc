/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAddInsOrgInfoThirdException;
import com.nbp.janaac.application.form.service.model.AddInsOrgInfoThird;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the add ins org info third service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddInsOrgInfoThirdUtil
 * @generated
 */
@ProviderType
public interface AddInsOrgInfoThirdPersistence
	extends BasePersistence<AddInsOrgInfoThird> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AddInsOrgInfoThirdUtil} to access the add ins org info third persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the add ins org info thirds where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add ins org info thirds
	 */
	public java.util.List<AddInsOrgInfoThird> findBygetJanaacById(
		long janaacApplicationId);

	/**
	 * Returns a range of all the add ins org info thirds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoThirdModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add ins org info thirds
	 * @param end the upper bound of the range of add ins org info thirds (not inclusive)
	 * @return the range of matching add ins org info thirds
	 */
	public java.util.List<AddInsOrgInfoThird> findBygetJanaacById(
		long janaacApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the add ins org info thirds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoThirdModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add ins org info thirds
	 * @param end the upper bound of the range of add ins org info thirds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add ins org info thirds
	 */
	public java.util.List<AddInsOrgInfoThird> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddInsOrgInfoThird>
			orderByComparator);

	/**
	 * Returns an ordered range of all the add ins org info thirds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoThirdModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add ins org info thirds
	 * @param end the upper bound of the range of add ins org info thirds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add ins org info thirds
	 */
	public java.util.List<AddInsOrgInfoThird> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddInsOrgInfoThird>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first add ins org info third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add ins org info third
	 * @throws NoSuchAddInsOrgInfoThirdException if a matching add ins org info third could not be found
	 */
	public AddInsOrgInfoThird findBygetJanaacById_First(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<AddInsOrgInfoThird>
				orderByComparator)
		throws NoSuchAddInsOrgInfoThirdException;

	/**
	 * Returns the first add ins org info third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add ins org info third, or <code>null</code> if a matching add ins org info third could not be found
	 */
	public AddInsOrgInfoThird fetchBygetJanaacById_First(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AddInsOrgInfoThird>
			orderByComparator);

	/**
	 * Returns the last add ins org info third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add ins org info third
	 * @throws NoSuchAddInsOrgInfoThirdException if a matching add ins org info third could not be found
	 */
	public AddInsOrgInfoThird findBygetJanaacById_Last(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<AddInsOrgInfoThird>
				orderByComparator)
		throws NoSuchAddInsOrgInfoThirdException;

	/**
	 * Returns the last add ins org info third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add ins org info third, or <code>null</code> if a matching add ins org info third could not be found
	 */
	public AddInsOrgInfoThird fetchBygetJanaacById_Last(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AddInsOrgInfoThird>
			orderByComparator);

	/**
	 * Returns the add ins org info thirds before and after the current add ins org info third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param AddInsOrgInfoThirdId the primary key of the current add ins org info third
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add ins org info third
	 * @throws NoSuchAddInsOrgInfoThirdException if a add ins org info third with the primary key could not be found
	 */
	public AddInsOrgInfoThird[] findBygetJanaacById_PrevAndNext(
			long AddInsOrgInfoThirdId, long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<AddInsOrgInfoThird>
				orderByComparator)
		throws NoSuchAddInsOrgInfoThirdException;

	/**
	 * Removes all the add ins org info thirds where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public void removeBygetJanaacById(long janaacApplicationId);

	/**
	 * Returns the number of add ins org info thirds where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add ins org info thirds
	 */
	public int countBygetJanaacById(long janaacApplicationId);

	/**
	 * Caches the add ins org info third in the entity cache if it is enabled.
	 *
	 * @param addInsOrgInfoThird the add ins org info third
	 */
	public void cacheResult(AddInsOrgInfoThird addInsOrgInfoThird);

	/**
	 * Caches the add ins org info thirds in the entity cache if it is enabled.
	 *
	 * @param addInsOrgInfoThirds the add ins org info thirds
	 */
	public void cacheResult(
		java.util.List<AddInsOrgInfoThird> addInsOrgInfoThirds);

	/**
	 * Creates a new add ins org info third with the primary key. Does not add the add ins org info third to the database.
	 *
	 * @param AddInsOrgInfoThirdId the primary key for the new add ins org info third
	 * @return the new add ins org info third
	 */
	public AddInsOrgInfoThird create(long AddInsOrgInfoThirdId);

	/**
	 * Removes the add ins org info third with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param AddInsOrgInfoThirdId the primary key of the add ins org info third
	 * @return the add ins org info third that was removed
	 * @throws NoSuchAddInsOrgInfoThirdException if a add ins org info third with the primary key could not be found
	 */
	public AddInsOrgInfoThird remove(long AddInsOrgInfoThirdId)
		throws NoSuchAddInsOrgInfoThirdException;

	public AddInsOrgInfoThird updateImpl(AddInsOrgInfoThird addInsOrgInfoThird);

	/**
	 * Returns the add ins org info third with the primary key or throws a <code>NoSuchAddInsOrgInfoThirdException</code> if it could not be found.
	 *
	 * @param AddInsOrgInfoThirdId the primary key of the add ins org info third
	 * @return the add ins org info third
	 * @throws NoSuchAddInsOrgInfoThirdException if a add ins org info third with the primary key could not be found
	 */
	public AddInsOrgInfoThird findByPrimaryKey(long AddInsOrgInfoThirdId)
		throws NoSuchAddInsOrgInfoThirdException;

	/**
	 * Returns the add ins org info third with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param AddInsOrgInfoThirdId the primary key of the add ins org info third
	 * @return the add ins org info third, or <code>null</code> if a add ins org info third with the primary key could not be found
	 */
	public AddInsOrgInfoThird fetchByPrimaryKey(long AddInsOrgInfoThirdId);

	/**
	 * Returns all the add ins org info thirds.
	 *
	 * @return the add ins org info thirds
	 */
	public java.util.List<AddInsOrgInfoThird> findAll();

	/**
	 * Returns a range of all the add ins org info thirds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoThirdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add ins org info thirds
	 * @param end the upper bound of the range of add ins org info thirds (not inclusive)
	 * @return the range of add ins org info thirds
	 */
	public java.util.List<AddInsOrgInfoThird> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the add ins org info thirds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoThirdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add ins org info thirds
	 * @param end the upper bound of the range of add ins org info thirds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add ins org info thirds
	 */
	public java.util.List<AddInsOrgInfoThird> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddInsOrgInfoThird>
			orderByComparator);

	/**
	 * Returns an ordered range of all the add ins org info thirds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoThirdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add ins org info thirds
	 * @param end the upper bound of the range of add ins org info thirds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add ins org info thirds
	 */
	public java.util.List<AddInsOrgInfoThird> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddInsOrgInfoThird>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the add ins org info thirds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of add ins org info thirds.
	 *
	 * @return the number of add ins org info thirds
	 */
	public int countAll();

}