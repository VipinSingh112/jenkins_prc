/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAddPhyResourceSecException;
import com.nbp.janaac.application.form.service.model.AddPhyResourceSec;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the add phy resource sec service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddPhyResourceSecUtil
 * @generated
 */
@ProviderType
public interface AddPhyResourceSecPersistence
	extends BasePersistence<AddPhyResourceSec> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AddPhyResourceSecUtil} to access the add phy resource sec persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the add phy resource secs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add phy resource secs
	 */
	public java.util.List<AddPhyResourceSec> findBygetJanaacById(
		long janaacApplicationId);

	/**
	 * Returns a range of all the add phy resource secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddPhyResourceSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add phy resource secs
	 * @param end the upper bound of the range of add phy resource secs (not inclusive)
	 * @return the range of matching add phy resource secs
	 */
	public java.util.List<AddPhyResourceSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the add phy resource secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddPhyResourceSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add phy resource secs
	 * @param end the upper bound of the range of add phy resource secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add phy resource secs
	 */
	public java.util.List<AddPhyResourceSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddPhyResourceSec>
			orderByComparator);

	/**
	 * Returns an ordered range of all the add phy resource secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddPhyResourceSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add phy resource secs
	 * @param end the upper bound of the range of add phy resource secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add phy resource secs
	 */
	public java.util.List<AddPhyResourceSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddPhyResourceSec>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first add phy resource sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add phy resource sec
	 * @throws NoSuchAddPhyResourceSecException if a matching add phy resource sec could not be found
	 */
	public AddPhyResourceSec findBygetJanaacById_First(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<AddPhyResourceSec>
				orderByComparator)
		throws NoSuchAddPhyResourceSecException;

	/**
	 * Returns the first add phy resource sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add phy resource sec, or <code>null</code> if a matching add phy resource sec could not be found
	 */
	public AddPhyResourceSec fetchBygetJanaacById_First(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AddPhyResourceSec>
			orderByComparator);

	/**
	 * Returns the last add phy resource sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add phy resource sec
	 * @throws NoSuchAddPhyResourceSecException if a matching add phy resource sec could not be found
	 */
	public AddPhyResourceSec findBygetJanaacById_Last(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<AddPhyResourceSec>
				orderByComparator)
		throws NoSuchAddPhyResourceSecException;

	/**
	 * Returns the last add phy resource sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add phy resource sec, or <code>null</code> if a matching add phy resource sec could not be found
	 */
	public AddPhyResourceSec fetchBygetJanaacById_Last(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AddPhyResourceSec>
			orderByComparator);

	/**
	 * Returns the add phy resource secs before and after the current add phy resource sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addPhyResourceSecId the primary key of the current add phy resource sec
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add phy resource sec
	 * @throws NoSuchAddPhyResourceSecException if a add phy resource sec with the primary key could not be found
	 */
	public AddPhyResourceSec[] findBygetJanaacById_PrevAndNext(
			long addPhyResourceSecId, long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<AddPhyResourceSec>
				orderByComparator)
		throws NoSuchAddPhyResourceSecException;

	/**
	 * Removes all the add phy resource secs where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public void removeBygetJanaacById(long janaacApplicationId);

	/**
	 * Returns the number of add phy resource secs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add phy resource secs
	 */
	public int countBygetJanaacById(long janaacApplicationId);

	/**
	 * Caches the add phy resource sec in the entity cache if it is enabled.
	 *
	 * @param addPhyResourceSec the add phy resource sec
	 */
	public void cacheResult(AddPhyResourceSec addPhyResourceSec);

	/**
	 * Caches the add phy resource secs in the entity cache if it is enabled.
	 *
	 * @param addPhyResourceSecs the add phy resource secs
	 */
	public void cacheResult(
		java.util.List<AddPhyResourceSec> addPhyResourceSecs);

	/**
	 * Creates a new add phy resource sec with the primary key. Does not add the add phy resource sec to the database.
	 *
	 * @param addPhyResourceSecId the primary key for the new add phy resource sec
	 * @return the new add phy resource sec
	 */
	public AddPhyResourceSec create(long addPhyResourceSecId);

	/**
	 * Removes the add phy resource sec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addPhyResourceSecId the primary key of the add phy resource sec
	 * @return the add phy resource sec that was removed
	 * @throws NoSuchAddPhyResourceSecException if a add phy resource sec with the primary key could not be found
	 */
	public AddPhyResourceSec remove(long addPhyResourceSecId)
		throws NoSuchAddPhyResourceSecException;

	public AddPhyResourceSec updateImpl(AddPhyResourceSec addPhyResourceSec);

	/**
	 * Returns the add phy resource sec with the primary key or throws a <code>NoSuchAddPhyResourceSecException</code> if it could not be found.
	 *
	 * @param addPhyResourceSecId the primary key of the add phy resource sec
	 * @return the add phy resource sec
	 * @throws NoSuchAddPhyResourceSecException if a add phy resource sec with the primary key could not be found
	 */
	public AddPhyResourceSec findByPrimaryKey(long addPhyResourceSecId)
		throws NoSuchAddPhyResourceSecException;

	/**
	 * Returns the add phy resource sec with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addPhyResourceSecId the primary key of the add phy resource sec
	 * @return the add phy resource sec, or <code>null</code> if a add phy resource sec with the primary key could not be found
	 */
	public AddPhyResourceSec fetchByPrimaryKey(long addPhyResourceSecId);

	/**
	 * Returns all the add phy resource secs.
	 *
	 * @return the add phy resource secs
	 */
	public java.util.List<AddPhyResourceSec> findAll();

	/**
	 * Returns a range of all the add phy resource secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddPhyResourceSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add phy resource secs
	 * @param end the upper bound of the range of add phy resource secs (not inclusive)
	 * @return the range of add phy resource secs
	 */
	public java.util.List<AddPhyResourceSec> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the add phy resource secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddPhyResourceSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add phy resource secs
	 * @param end the upper bound of the range of add phy resource secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add phy resource secs
	 */
	public java.util.List<AddPhyResourceSec> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddPhyResourceSec>
			orderByComparator);

	/**
	 * Returns an ordered range of all the add phy resource secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddPhyResourceSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add phy resource secs
	 * @param end the upper bound of the range of add phy resource secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add phy resource secs
	 */
	public java.util.List<AddPhyResourceSec> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddPhyResourceSec>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the add phy resource secs from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of add phy resource secs.
	 *
	 * @return the number of add phy resource secs
	 */
	public int countAll();

}