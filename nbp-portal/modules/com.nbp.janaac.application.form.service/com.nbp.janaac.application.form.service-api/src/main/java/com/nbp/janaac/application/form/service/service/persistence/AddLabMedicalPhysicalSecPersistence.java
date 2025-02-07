/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAddLabMedicalPhysicalSecException;
import com.nbp.janaac.application.form.service.model.AddLabMedicalPhysicalSec;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the add lab medical physical sec service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddLabMedicalPhysicalSecUtil
 * @generated
 */
@ProviderType
public interface AddLabMedicalPhysicalSecPersistence
	extends BasePersistence<AddLabMedicalPhysicalSec> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AddLabMedicalPhysicalSecUtil} to access the add lab medical physical sec persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the add lab medical physical secs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add lab medical physical secs
	 */
	public java.util.List<AddLabMedicalPhysicalSec> findBygetJanaacById(
		long janaacApplicationId);

	/**
	 * Returns a range of all the add lab medical physical secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalPhysicalSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab medical physical secs
	 * @param end the upper bound of the range of add lab medical physical secs (not inclusive)
	 * @return the range of matching add lab medical physical secs
	 */
	public java.util.List<AddLabMedicalPhysicalSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the add lab medical physical secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalPhysicalSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab medical physical secs
	 * @param end the upper bound of the range of add lab medical physical secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add lab medical physical secs
	 */
	public java.util.List<AddLabMedicalPhysicalSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddLabMedicalPhysicalSec> orderByComparator);

	/**
	 * Returns an ordered range of all the add lab medical physical secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalPhysicalSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab medical physical secs
	 * @param end the upper bound of the range of add lab medical physical secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add lab medical physical secs
	 */
	public java.util.List<AddLabMedicalPhysicalSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddLabMedicalPhysicalSec> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first add lab medical physical sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab medical physical sec
	 * @throws NoSuchAddLabMedicalPhysicalSecException if a matching add lab medical physical sec could not be found
	 */
	public AddLabMedicalPhysicalSec findBygetJanaacById_First(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddLabMedicalPhysicalSec> orderByComparator)
		throws NoSuchAddLabMedicalPhysicalSecException;

	/**
	 * Returns the first add lab medical physical sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab medical physical sec, or <code>null</code> if a matching add lab medical physical sec could not be found
	 */
	public AddLabMedicalPhysicalSec fetchBygetJanaacById_First(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddLabMedicalPhysicalSec> orderByComparator);

	/**
	 * Returns the last add lab medical physical sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab medical physical sec
	 * @throws NoSuchAddLabMedicalPhysicalSecException if a matching add lab medical physical sec could not be found
	 */
	public AddLabMedicalPhysicalSec findBygetJanaacById_Last(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddLabMedicalPhysicalSec> orderByComparator)
		throws NoSuchAddLabMedicalPhysicalSecException;

	/**
	 * Returns the last add lab medical physical sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab medical physical sec, or <code>null</code> if a matching add lab medical physical sec could not be found
	 */
	public AddLabMedicalPhysicalSec fetchBygetJanaacById_Last(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddLabMedicalPhysicalSec> orderByComparator);

	/**
	 * Returns the add lab medical physical secs before and after the current add lab medical physical sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addLabMedicalPhysicalSecId the primary key of the current add lab medical physical sec
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add lab medical physical sec
	 * @throws NoSuchAddLabMedicalPhysicalSecException if a add lab medical physical sec with the primary key could not be found
	 */
	public AddLabMedicalPhysicalSec[] findBygetJanaacById_PrevAndNext(
			long addLabMedicalPhysicalSecId, long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddLabMedicalPhysicalSec> orderByComparator)
		throws NoSuchAddLabMedicalPhysicalSecException;

	/**
	 * Removes all the add lab medical physical secs where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public void removeBygetJanaacById(long janaacApplicationId);

	/**
	 * Returns the number of add lab medical physical secs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add lab medical physical secs
	 */
	public int countBygetJanaacById(long janaacApplicationId);

	/**
	 * Caches the add lab medical physical sec in the entity cache if it is enabled.
	 *
	 * @param addLabMedicalPhysicalSec the add lab medical physical sec
	 */
	public void cacheResult(AddLabMedicalPhysicalSec addLabMedicalPhysicalSec);

	/**
	 * Caches the add lab medical physical secs in the entity cache if it is enabled.
	 *
	 * @param addLabMedicalPhysicalSecs the add lab medical physical secs
	 */
	public void cacheResult(
		java.util.List<AddLabMedicalPhysicalSec> addLabMedicalPhysicalSecs);

	/**
	 * Creates a new add lab medical physical sec with the primary key. Does not add the add lab medical physical sec to the database.
	 *
	 * @param addLabMedicalPhysicalSecId the primary key for the new add lab medical physical sec
	 * @return the new add lab medical physical sec
	 */
	public AddLabMedicalPhysicalSec create(long addLabMedicalPhysicalSecId);

	/**
	 * Removes the add lab medical physical sec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addLabMedicalPhysicalSecId the primary key of the add lab medical physical sec
	 * @return the add lab medical physical sec that was removed
	 * @throws NoSuchAddLabMedicalPhysicalSecException if a add lab medical physical sec with the primary key could not be found
	 */
	public AddLabMedicalPhysicalSec remove(long addLabMedicalPhysicalSecId)
		throws NoSuchAddLabMedicalPhysicalSecException;

	public AddLabMedicalPhysicalSec updateImpl(
		AddLabMedicalPhysicalSec addLabMedicalPhysicalSec);

	/**
	 * Returns the add lab medical physical sec with the primary key or throws a <code>NoSuchAddLabMedicalPhysicalSecException</code> if it could not be found.
	 *
	 * @param addLabMedicalPhysicalSecId the primary key of the add lab medical physical sec
	 * @return the add lab medical physical sec
	 * @throws NoSuchAddLabMedicalPhysicalSecException if a add lab medical physical sec with the primary key could not be found
	 */
	public AddLabMedicalPhysicalSec findByPrimaryKey(
			long addLabMedicalPhysicalSecId)
		throws NoSuchAddLabMedicalPhysicalSecException;

	/**
	 * Returns the add lab medical physical sec with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addLabMedicalPhysicalSecId the primary key of the add lab medical physical sec
	 * @return the add lab medical physical sec, or <code>null</code> if a add lab medical physical sec with the primary key could not be found
	 */
	public AddLabMedicalPhysicalSec fetchByPrimaryKey(
		long addLabMedicalPhysicalSecId);

	/**
	 * Returns all the add lab medical physical secs.
	 *
	 * @return the add lab medical physical secs
	 */
	public java.util.List<AddLabMedicalPhysicalSec> findAll();

	/**
	 * Returns a range of all the add lab medical physical secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalPhysicalSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab medical physical secs
	 * @param end the upper bound of the range of add lab medical physical secs (not inclusive)
	 * @return the range of add lab medical physical secs
	 */
	public java.util.List<AddLabMedicalPhysicalSec> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the add lab medical physical secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalPhysicalSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab medical physical secs
	 * @param end the upper bound of the range of add lab medical physical secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add lab medical physical secs
	 */
	public java.util.List<AddLabMedicalPhysicalSec> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddLabMedicalPhysicalSec> orderByComparator);

	/**
	 * Returns an ordered range of all the add lab medical physical secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalPhysicalSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab medical physical secs
	 * @param end the upper bound of the range of add lab medical physical secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add lab medical physical secs
	 */
	public java.util.List<AddLabMedicalPhysicalSec> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddLabMedicalPhysicalSec> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the add lab medical physical secs from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of add lab medical physical secs.
	 *
	 * @return the number of add lab medical physical secs
	 */
	public int countAll();

}