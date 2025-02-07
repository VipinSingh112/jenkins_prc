/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAddLabMedicalDescOfActiSecException;
import com.nbp.janaac.application.form.service.model.AddLabMedicalDescOfActiSec;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the add lab medical desc of acti sec service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddLabMedicalDescOfActiSecUtil
 * @generated
 */
@ProviderType
public interface AddLabMedicalDescOfActiSecPersistence
	extends BasePersistence<AddLabMedicalDescOfActiSec> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AddLabMedicalDescOfActiSecUtil} to access the add lab medical desc of acti sec persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the add lab medical desc of acti secs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add lab medical desc of acti secs
	 */
	public java.util.List<AddLabMedicalDescOfActiSec> findBygetJanaacById(
		long janaacApplicationId);

	/**
	 * Returns a range of all the add lab medical desc of acti secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalDescOfActiSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab medical desc of acti secs
	 * @param end the upper bound of the range of add lab medical desc of acti secs (not inclusive)
	 * @return the range of matching add lab medical desc of acti secs
	 */
	public java.util.List<AddLabMedicalDescOfActiSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the add lab medical desc of acti secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalDescOfActiSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab medical desc of acti secs
	 * @param end the upper bound of the range of add lab medical desc of acti secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add lab medical desc of acti secs
	 */
	public java.util.List<AddLabMedicalDescOfActiSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddLabMedicalDescOfActiSec> orderByComparator);

	/**
	 * Returns an ordered range of all the add lab medical desc of acti secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalDescOfActiSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab medical desc of acti secs
	 * @param end the upper bound of the range of add lab medical desc of acti secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add lab medical desc of acti secs
	 */
	public java.util.List<AddLabMedicalDescOfActiSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddLabMedicalDescOfActiSec> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first add lab medical desc of acti sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab medical desc of acti sec
	 * @throws NoSuchAddLabMedicalDescOfActiSecException if a matching add lab medical desc of acti sec could not be found
	 */
	public AddLabMedicalDescOfActiSec findBygetJanaacById_First(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddLabMedicalDescOfActiSec> orderByComparator)
		throws NoSuchAddLabMedicalDescOfActiSecException;

	/**
	 * Returns the first add lab medical desc of acti sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab medical desc of acti sec, or <code>null</code> if a matching add lab medical desc of acti sec could not be found
	 */
	public AddLabMedicalDescOfActiSec fetchBygetJanaacById_First(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddLabMedicalDescOfActiSec> orderByComparator);

	/**
	 * Returns the last add lab medical desc of acti sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab medical desc of acti sec
	 * @throws NoSuchAddLabMedicalDescOfActiSecException if a matching add lab medical desc of acti sec could not be found
	 */
	public AddLabMedicalDescOfActiSec findBygetJanaacById_Last(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddLabMedicalDescOfActiSec> orderByComparator)
		throws NoSuchAddLabMedicalDescOfActiSecException;

	/**
	 * Returns the last add lab medical desc of acti sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab medical desc of acti sec, or <code>null</code> if a matching add lab medical desc of acti sec could not be found
	 */
	public AddLabMedicalDescOfActiSec fetchBygetJanaacById_Last(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddLabMedicalDescOfActiSec> orderByComparator);

	/**
	 * Returns the add lab medical desc of acti secs before and after the current add lab medical desc of acti sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addLabMedicalDescOfActiSecId the primary key of the current add lab medical desc of acti sec
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add lab medical desc of acti sec
	 * @throws NoSuchAddLabMedicalDescOfActiSecException if a add lab medical desc of acti sec with the primary key could not be found
	 */
	public AddLabMedicalDescOfActiSec[] findBygetJanaacById_PrevAndNext(
			long addLabMedicalDescOfActiSecId, long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddLabMedicalDescOfActiSec> orderByComparator)
		throws NoSuchAddLabMedicalDescOfActiSecException;

	/**
	 * Removes all the add lab medical desc of acti secs where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public void removeBygetJanaacById(long janaacApplicationId);

	/**
	 * Returns the number of add lab medical desc of acti secs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add lab medical desc of acti secs
	 */
	public int countBygetJanaacById(long janaacApplicationId);

	/**
	 * Caches the add lab medical desc of acti sec in the entity cache if it is enabled.
	 *
	 * @param addLabMedicalDescOfActiSec the add lab medical desc of acti sec
	 */
	public void cacheResult(
		AddLabMedicalDescOfActiSec addLabMedicalDescOfActiSec);

	/**
	 * Caches the add lab medical desc of acti secs in the entity cache if it is enabled.
	 *
	 * @param addLabMedicalDescOfActiSecs the add lab medical desc of acti secs
	 */
	public void cacheResult(
		java.util.List<AddLabMedicalDescOfActiSec> addLabMedicalDescOfActiSecs);

	/**
	 * Creates a new add lab medical desc of acti sec with the primary key. Does not add the add lab medical desc of acti sec to the database.
	 *
	 * @param addLabMedicalDescOfActiSecId the primary key for the new add lab medical desc of acti sec
	 * @return the new add lab medical desc of acti sec
	 */
	public AddLabMedicalDescOfActiSec create(long addLabMedicalDescOfActiSecId);

	/**
	 * Removes the add lab medical desc of acti sec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addLabMedicalDescOfActiSecId the primary key of the add lab medical desc of acti sec
	 * @return the add lab medical desc of acti sec that was removed
	 * @throws NoSuchAddLabMedicalDescOfActiSecException if a add lab medical desc of acti sec with the primary key could not be found
	 */
	public AddLabMedicalDescOfActiSec remove(long addLabMedicalDescOfActiSecId)
		throws NoSuchAddLabMedicalDescOfActiSecException;

	public AddLabMedicalDescOfActiSec updateImpl(
		AddLabMedicalDescOfActiSec addLabMedicalDescOfActiSec);

	/**
	 * Returns the add lab medical desc of acti sec with the primary key or throws a <code>NoSuchAddLabMedicalDescOfActiSecException</code> if it could not be found.
	 *
	 * @param addLabMedicalDescOfActiSecId the primary key of the add lab medical desc of acti sec
	 * @return the add lab medical desc of acti sec
	 * @throws NoSuchAddLabMedicalDescOfActiSecException if a add lab medical desc of acti sec with the primary key could not be found
	 */
	public AddLabMedicalDescOfActiSec findByPrimaryKey(
			long addLabMedicalDescOfActiSecId)
		throws NoSuchAddLabMedicalDescOfActiSecException;

	/**
	 * Returns the add lab medical desc of acti sec with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addLabMedicalDescOfActiSecId the primary key of the add lab medical desc of acti sec
	 * @return the add lab medical desc of acti sec, or <code>null</code> if a add lab medical desc of acti sec with the primary key could not be found
	 */
	public AddLabMedicalDescOfActiSec fetchByPrimaryKey(
		long addLabMedicalDescOfActiSecId);

	/**
	 * Returns all the add lab medical desc of acti secs.
	 *
	 * @return the add lab medical desc of acti secs
	 */
	public java.util.List<AddLabMedicalDescOfActiSec> findAll();

	/**
	 * Returns a range of all the add lab medical desc of acti secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalDescOfActiSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab medical desc of acti secs
	 * @param end the upper bound of the range of add lab medical desc of acti secs (not inclusive)
	 * @return the range of add lab medical desc of acti secs
	 */
	public java.util.List<AddLabMedicalDescOfActiSec> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the add lab medical desc of acti secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalDescOfActiSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab medical desc of acti secs
	 * @param end the upper bound of the range of add lab medical desc of acti secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add lab medical desc of acti secs
	 */
	public java.util.List<AddLabMedicalDescOfActiSec> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddLabMedicalDescOfActiSec> orderByComparator);

	/**
	 * Returns an ordered range of all the add lab medical desc of acti secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalDescOfActiSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab medical desc of acti secs
	 * @param end the upper bound of the range of add lab medical desc of acti secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add lab medical desc of acti secs
	 */
	public java.util.List<AddLabMedicalDescOfActiSec> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddLabMedicalDescOfActiSec> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the add lab medical desc of acti secs from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of add lab medical desc of acti secs.
	 *
	 * @return the number of add lab medical desc of acti secs
	 */
	public int countAll();

}