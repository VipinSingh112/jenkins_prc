/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAddLabTestStructuralReqSecException;
import com.nbp.janaac.application.form.service.model.AddLabTestStructuralReqSec;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the add lab test structural req sec service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddLabTestStructuralReqSecUtil
 * @generated
 */
@ProviderType
public interface AddLabTestStructuralReqSecPersistence
	extends BasePersistence<AddLabTestStructuralReqSec> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AddLabTestStructuralReqSecUtil} to access the add lab test structural req sec persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the add lab test structural req secs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add lab test structural req secs
	 */
	public java.util.List<AddLabTestStructuralReqSec> findBygetJanaacById(
		long janaacApplicationId);

	/**
	 * Returns a range of all the add lab test structural req secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabTestStructuralReqSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab test structural req secs
	 * @param end the upper bound of the range of add lab test structural req secs (not inclusive)
	 * @return the range of matching add lab test structural req secs
	 */
	public java.util.List<AddLabTestStructuralReqSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the add lab test structural req secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabTestStructuralReqSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab test structural req secs
	 * @param end the upper bound of the range of add lab test structural req secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add lab test structural req secs
	 */
	public java.util.List<AddLabTestStructuralReqSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddLabTestStructuralReqSec> orderByComparator);

	/**
	 * Returns an ordered range of all the add lab test structural req secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabTestStructuralReqSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab test structural req secs
	 * @param end the upper bound of the range of add lab test structural req secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add lab test structural req secs
	 */
	public java.util.List<AddLabTestStructuralReqSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddLabTestStructuralReqSec> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first add lab test structural req sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab test structural req sec
	 * @throws NoSuchAddLabTestStructuralReqSecException if a matching add lab test structural req sec could not be found
	 */
	public AddLabTestStructuralReqSec findBygetJanaacById_First(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddLabTestStructuralReqSec> orderByComparator)
		throws NoSuchAddLabTestStructuralReqSecException;

	/**
	 * Returns the first add lab test structural req sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab test structural req sec, or <code>null</code> if a matching add lab test structural req sec could not be found
	 */
	public AddLabTestStructuralReqSec fetchBygetJanaacById_First(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddLabTestStructuralReqSec> orderByComparator);

	/**
	 * Returns the last add lab test structural req sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab test structural req sec
	 * @throws NoSuchAddLabTestStructuralReqSecException if a matching add lab test structural req sec could not be found
	 */
	public AddLabTestStructuralReqSec findBygetJanaacById_Last(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddLabTestStructuralReqSec> orderByComparator)
		throws NoSuchAddLabTestStructuralReqSecException;

	/**
	 * Returns the last add lab test structural req sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab test structural req sec, or <code>null</code> if a matching add lab test structural req sec could not be found
	 */
	public AddLabTestStructuralReqSec fetchBygetJanaacById_Last(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddLabTestStructuralReqSec> orderByComparator);

	/**
	 * Returns the add lab test structural req secs before and after the current add lab test structural req sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addLabTestStructuralReqSecId the primary key of the current add lab test structural req sec
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add lab test structural req sec
	 * @throws NoSuchAddLabTestStructuralReqSecException if a add lab test structural req sec with the primary key could not be found
	 */
	public AddLabTestStructuralReqSec[] findBygetJanaacById_PrevAndNext(
			long addLabTestStructuralReqSecId, long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddLabTestStructuralReqSec> orderByComparator)
		throws NoSuchAddLabTestStructuralReqSecException;

	/**
	 * Removes all the add lab test structural req secs where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public void removeBygetJanaacById(long janaacApplicationId);

	/**
	 * Returns the number of add lab test structural req secs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add lab test structural req secs
	 */
	public int countBygetJanaacById(long janaacApplicationId);

	/**
	 * Caches the add lab test structural req sec in the entity cache if it is enabled.
	 *
	 * @param addLabTestStructuralReqSec the add lab test structural req sec
	 */
	public void cacheResult(
		AddLabTestStructuralReqSec addLabTestStructuralReqSec);

	/**
	 * Caches the add lab test structural req secs in the entity cache if it is enabled.
	 *
	 * @param addLabTestStructuralReqSecs the add lab test structural req secs
	 */
	public void cacheResult(
		java.util.List<AddLabTestStructuralReqSec> addLabTestStructuralReqSecs);

	/**
	 * Creates a new add lab test structural req sec with the primary key. Does not add the add lab test structural req sec to the database.
	 *
	 * @param addLabTestStructuralReqSecId the primary key for the new add lab test structural req sec
	 * @return the new add lab test structural req sec
	 */
	public AddLabTestStructuralReqSec create(long addLabTestStructuralReqSecId);

	/**
	 * Removes the add lab test structural req sec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addLabTestStructuralReqSecId the primary key of the add lab test structural req sec
	 * @return the add lab test structural req sec that was removed
	 * @throws NoSuchAddLabTestStructuralReqSecException if a add lab test structural req sec with the primary key could not be found
	 */
	public AddLabTestStructuralReqSec remove(long addLabTestStructuralReqSecId)
		throws NoSuchAddLabTestStructuralReqSecException;

	public AddLabTestStructuralReqSec updateImpl(
		AddLabTestStructuralReqSec addLabTestStructuralReqSec);

	/**
	 * Returns the add lab test structural req sec with the primary key or throws a <code>NoSuchAddLabTestStructuralReqSecException</code> if it could not be found.
	 *
	 * @param addLabTestStructuralReqSecId the primary key of the add lab test structural req sec
	 * @return the add lab test structural req sec
	 * @throws NoSuchAddLabTestStructuralReqSecException if a add lab test structural req sec with the primary key could not be found
	 */
	public AddLabTestStructuralReqSec findByPrimaryKey(
			long addLabTestStructuralReqSecId)
		throws NoSuchAddLabTestStructuralReqSecException;

	/**
	 * Returns the add lab test structural req sec with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addLabTestStructuralReqSecId the primary key of the add lab test structural req sec
	 * @return the add lab test structural req sec, or <code>null</code> if a add lab test structural req sec with the primary key could not be found
	 */
	public AddLabTestStructuralReqSec fetchByPrimaryKey(
		long addLabTestStructuralReqSecId);

	/**
	 * Returns all the add lab test structural req secs.
	 *
	 * @return the add lab test structural req secs
	 */
	public java.util.List<AddLabTestStructuralReqSec> findAll();

	/**
	 * Returns a range of all the add lab test structural req secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabTestStructuralReqSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab test structural req secs
	 * @param end the upper bound of the range of add lab test structural req secs (not inclusive)
	 * @return the range of add lab test structural req secs
	 */
	public java.util.List<AddLabTestStructuralReqSec> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the add lab test structural req secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabTestStructuralReqSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab test structural req secs
	 * @param end the upper bound of the range of add lab test structural req secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add lab test structural req secs
	 */
	public java.util.List<AddLabTestStructuralReqSec> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddLabTestStructuralReqSec> orderByComparator);

	/**
	 * Returns an ordered range of all the add lab test structural req secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabTestStructuralReqSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab test structural req secs
	 * @param end the upper bound of the range of add lab test structural req secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add lab test structural req secs
	 */
	public java.util.List<AddLabTestStructuralReqSec> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddLabTestStructuralReqSec> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the add lab test structural req secs from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of add lab test structural req secs.
	 *
	 * @return the number of add lab test structural req secs
	 */
	public int countAll();

}