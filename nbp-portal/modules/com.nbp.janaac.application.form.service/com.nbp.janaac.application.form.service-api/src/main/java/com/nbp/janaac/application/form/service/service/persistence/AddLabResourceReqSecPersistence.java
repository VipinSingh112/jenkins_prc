/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAddLabResourceReqSecException;
import com.nbp.janaac.application.form.service.model.AddLabResourceReqSec;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the add lab resource req sec service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddLabResourceReqSecUtil
 * @generated
 */
@ProviderType
public interface AddLabResourceReqSecPersistence
	extends BasePersistence<AddLabResourceReqSec> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AddLabResourceReqSecUtil} to access the add lab resource req sec persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the add lab resource req secs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add lab resource req secs
	 */
	public java.util.List<AddLabResourceReqSec> findBygetJanaacById(
		long janaacApplicationId);

	/**
	 * Returns a range of all the add lab resource req secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabResourceReqSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab resource req secs
	 * @param end the upper bound of the range of add lab resource req secs (not inclusive)
	 * @return the range of matching add lab resource req secs
	 */
	public java.util.List<AddLabResourceReqSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the add lab resource req secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabResourceReqSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab resource req secs
	 * @param end the upper bound of the range of add lab resource req secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add lab resource req secs
	 */
	public java.util.List<AddLabResourceReqSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddLabResourceReqSec>
			orderByComparator);

	/**
	 * Returns an ordered range of all the add lab resource req secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabResourceReqSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab resource req secs
	 * @param end the upper bound of the range of add lab resource req secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add lab resource req secs
	 */
	public java.util.List<AddLabResourceReqSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddLabResourceReqSec>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first add lab resource req sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab resource req sec
	 * @throws NoSuchAddLabResourceReqSecException if a matching add lab resource req sec could not be found
	 */
	public AddLabResourceReqSec findBygetJanaacById_First(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddLabResourceReqSec> orderByComparator)
		throws NoSuchAddLabResourceReqSecException;

	/**
	 * Returns the first add lab resource req sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab resource req sec, or <code>null</code> if a matching add lab resource req sec could not be found
	 */
	public AddLabResourceReqSec fetchBygetJanaacById_First(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AddLabResourceReqSec>
			orderByComparator);

	/**
	 * Returns the last add lab resource req sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab resource req sec
	 * @throws NoSuchAddLabResourceReqSecException if a matching add lab resource req sec could not be found
	 */
	public AddLabResourceReqSec findBygetJanaacById_Last(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddLabResourceReqSec> orderByComparator)
		throws NoSuchAddLabResourceReqSecException;

	/**
	 * Returns the last add lab resource req sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab resource req sec, or <code>null</code> if a matching add lab resource req sec could not be found
	 */
	public AddLabResourceReqSec fetchBygetJanaacById_Last(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AddLabResourceReqSec>
			orderByComparator);

	/**
	 * Returns the add lab resource req secs before and after the current add lab resource req sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addLabResourceReqSecId the primary key of the current add lab resource req sec
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add lab resource req sec
	 * @throws NoSuchAddLabResourceReqSecException if a add lab resource req sec with the primary key could not be found
	 */
	public AddLabResourceReqSec[] findBygetJanaacById_PrevAndNext(
			long addLabResourceReqSecId, long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddLabResourceReqSec> orderByComparator)
		throws NoSuchAddLabResourceReqSecException;

	/**
	 * Removes all the add lab resource req secs where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public void removeBygetJanaacById(long janaacApplicationId);

	/**
	 * Returns the number of add lab resource req secs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add lab resource req secs
	 */
	public int countBygetJanaacById(long janaacApplicationId);

	/**
	 * Caches the add lab resource req sec in the entity cache if it is enabled.
	 *
	 * @param addLabResourceReqSec the add lab resource req sec
	 */
	public void cacheResult(AddLabResourceReqSec addLabResourceReqSec);

	/**
	 * Caches the add lab resource req secs in the entity cache if it is enabled.
	 *
	 * @param addLabResourceReqSecs the add lab resource req secs
	 */
	public void cacheResult(
		java.util.List<AddLabResourceReqSec> addLabResourceReqSecs);

	/**
	 * Creates a new add lab resource req sec with the primary key. Does not add the add lab resource req sec to the database.
	 *
	 * @param addLabResourceReqSecId the primary key for the new add lab resource req sec
	 * @return the new add lab resource req sec
	 */
	public AddLabResourceReqSec create(long addLabResourceReqSecId);

	/**
	 * Removes the add lab resource req sec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addLabResourceReqSecId the primary key of the add lab resource req sec
	 * @return the add lab resource req sec that was removed
	 * @throws NoSuchAddLabResourceReqSecException if a add lab resource req sec with the primary key could not be found
	 */
	public AddLabResourceReqSec remove(long addLabResourceReqSecId)
		throws NoSuchAddLabResourceReqSecException;

	public AddLabResourceReqSec updateImpl(
		AddLabResourceReqSec addLabResourceReqSec);

	/**
	 * Returns the add lab resource req sec with the primary key or throws a <code>NoSuchAddLabResourceReqSecException</code> if it could not be found.
	 *
	 * @param addLabResourceReqSecId the primary key of the add lab resource req sec
	 * @return the add lab resource req sec
	 * @throws NoSuchAddLabResourceReqSecException if a add lab resource req sec with the primary key could not be found
	 */
	public AddLabResourceReqSec findByPrimaryKey(long addLabResourceReqSecId)
		throws NoSuchAddLabResourceReqSecException;

	/**
	 * Returns the add lab resource req sec with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addLabResourceReqSecId the primary key of the add lab resource req sec
	 * @return the add lab resource req sec, or <code>null</code> if a add lab resource req sec with the primary key could not be found
	 */
	public AddLabResourceReqSec fetchByPrimaryKey(long addLabResourceReqSecId);

	/**
	 * Returns all the add lab resource req secs.
	 *
	 * @return the add lab resource req secs
	 */
	public java.util.List<AddLabResourceReqSec> findAll();

	/**
	 * Returns a range of all the add lab resource req secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabResourceReqSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab resource req secs
	 * @param end the upper bound of the range of add lab resource req secs (not inclusive)
	 * @return the range of add lab resource req secs
	 */
	public java.util.List<AddLabResourceReqSec> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the add lab resource req secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabResourceReqSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab resource req secs
	 * @param end the upper bound of the range of add lab resource req secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add lab resource req secs
	 */
	public java.util.List<AddLabResourceReqSec> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddLabResourceReqSec>
			orderByComparator);

	/**
	 * Returns an ordered range of all the add lab resource req secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabResourceReqSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab resource req secs
	 * @param end the upper bound of the range of add lab resource req secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add lab resource req secs
	 */
	public java.util.List<AddLabResourceReqSec> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddLabResourceReqSec>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the add lab resource req secs from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of add lab resource req secs.
	 *
	 * @return the number of add lab resource req secs
	 */
	public int countAll();

}