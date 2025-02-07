/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAddLabMedicalOrganSecException;
import com.nbp.janaac.application.form.service.model.AddLabMedicalOrganSec;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the add lab medical organ sec service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddLabMedicalOrganSecUtil
 * @generated
 */
@ProviderType
public interface AddLabMedicalOrganSecPersistence
	extends BasePersistence<AddLabMedicalOrganSec> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AddLabMedicalOrganSecUtil} to access the add lab medical organ sec persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the add lab medical organ secs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add lab medical organ secs
	 */
	public java.util.List<AddLabMedicalOrganSec> findBygetJanaacById(
		long janaacApplicationId);

	/**
	 * Returns a range of all the add lab medical organ secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalOrganSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab medical organ secs
	 * @param end the upper bound of the range of add lab medical organ secs (not inclusive)
	 * @return the range of matching add lab medical organ secs
	 */
	public java.util.List<AddLabMedicalOrganSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the add lab medical organ secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalOrganSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab medical organ secs
	 * @param end the upper bound of the range of add lab medical organ secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add lab medical organ secs
	 */
	public java.util.List<AddLabMedicalOrganSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddLabMedicalOrganSec>
			orderByComparator);

	/**
	 * Returns an ordered range of all the add lab medical organ secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalOrganSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab medical organ secs
	 * @param end the upper bound of the range of add lab medical organ secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add lab medical organ secs
	 */
	public java.util.List<AddLabMedicalOrganSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddLabMedicalOrganSec>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first add lab medical organ sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab medical organ sec
	 * @throws NoSuchAddLabMedicalOrganSecException if a matching add lab medical organ sec could not be found
	 */
	public AddLabMedicalOrganSec findBygetJanaacById_First(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddLabMedicalOrganSec> orderByComparator)
		throws NoSuchAddLabMedicalOrganSecException;

	/**
	 * Returns the first add lab medical organ sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab medical organ sec, or <code>null</code> if a matching add lab medical organ sec could not be found
	 */
	public AddLabMedicalOrganSec fetchBygetJanaacById_First(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AddLabMedicalOrganSec>
			orderByComparator);

	/**
	 * Returns the last add lab medical organ sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab medical organ sec
	 * @throws NoSuchAddLabMedicalOrganSecException if a matching add lab medical organ sec could not be found
	 */
	public AddLabMedicalOrganSec findBygetJanaacById_Last(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddLabMedicalOrganSec> orderByComparator)
		throws NoSuchAddLabMedicalOrganSecException;

	/**
	 * Returns the last add lab medical organ sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab medical organ sec, or <code>null</code> if a matching add lab medical organ sec could not be found
	 */
	public AddLabMedicalOrganSec fetchBygetJanaacById_Last(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AddLabMedicalOrganSec>
			orderByComparator);

	/**
	 * Returns the add lab medical organ secs before and after the current add lab medical organ sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addLabMedicalOrganSecId the primary key of the current add lab medical organ sec
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add lab medical organ sec
	 * @throws NoSuchAddLabMedicalOrganSecException if a add lab medical organ sec with the primary key could not be found
	 */
	public AddLabMedicalOrganSec[] findBygetJanaacById_PrevAndNext(
			long addLabMedicalOrganSecId, long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddLabMedicalOrganSec> orderByComparator)
		throws NoSuchAddLabMedicalOrganSecException;

	/**
	 * Removes all the add lab medical organ secs where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public void removeBygetJanaacById(long janaacApplicationId);

	/**
	 * Returns the number of add lab medical organ secs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add lab medical organ secs
	 */
	public int countBygetJanaacById(long janaacApplicationId);

	/**
	 * Caches the add lab medical organ sec in the entity cache if it is enabled.
	 *
	 * @param addLabMedicalOrganSec the add lab medical organ sec
	 */
	public void cacheResult(AddLabMedicalOrganSec addLabMedicalOrganSec);

	/**
	 * Caches the add lab medical organ secs in the entity cache if it is enabled.
	 *
	 * @param addLabMedicalOrganSecs the add lab medical organ secs
	 */
	public void cacheResult(
		java.util.List<AddLabMedicalOrganSec> addLabMedicalOrganSecs);

	/**
	 * Creates a new add lab medical organ sec with the primary key. Does not add the add lab medical organ sec to the database.
	 *
	 * @param addLabMedicalOrganSecId the primary key for the new add lab medical organ sec
	 * @return the new add lab medical organ sec
	 */
	public AddLabMedicalOrganSec create(long addLabMedicalOrganSecId);

	/**
	 * Removes the add lab medical organ sec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addLabMedicalOrganSecId the primary key of the add lab medical organ sec
	 * @return the add lab medical organ sec that was removed
	 * @throws NoSuchAddLabMedicalOrganSecException if a add lab medical organ sec with the primary key could not be found
	 */
	public AddLabMedicalOrganSec remove(long addLabMedicalOrganSecId)
		throws NoSuchAddLabMedicalOrganSecException;

	public AddLabMedicalOrganSec updateImpl(
		AddLabMedicalOrganSec addLabMedicalOrganSec);

	/**
	 * Returns the add lab medical organ sec with the primary key or throws a <code>NoSuchAddLabMedicalOrganSecException</code> if it could not be found.
	 *
	 * @param addLabMedicalOrganSecId the primary key of the add lab medical organ sec
	 * @return the add lab medical organ sec
	 * @throws NoSuchAddLabMedicalOrganSecException if a add lab medical organ sec with the primary key could not be found
	 */
	public AddLabMedicalOrganSec findByPrimaryKey(long addLabMedicalOrganSecId)
		throws NoSuchAddLabMedicalOrganSecException;

	/**
	 * Returns the add lab medical organ sec with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addLabMedicalOrganSecId the primary key of the add lab medical organ sec
	 * @return the add lab medical organ sec, or <code>null</code> if a add lab medical organ sec with the primary key could not be found
	 */
	public AddLabMedicalOrganSec fetchByPrimaryKey(
		long addLabMedicalOrganSecId);

	/**
	 * Returns all the add lab medical organ secs.
	 *
	 * @return the add lab medical organ secs
	 */
	public java.util.List<AddLabMedicalOrganSec> findAll();

	/**
	 * Returns a range of all the add lab medical organ secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalOrganSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab medical organ secs
	 * @param end the upper bound of the range of add lab medical organ secs (not inclusive)
	 * @return the range of add lab medical organ secs
	 */
	public java.util.List<AddLabMedicalOrganSec> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the add lab medical organ secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalOrganSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab medical organ secs
	 * @param end the upper bound of the range of add lab medical organ secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add lab medical organ secs
	 */
	public java.util.List<AddLabMedicalOrganSec> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddLabMedicalOrganSec>
			orderByComparator);

	/**
	 * Returns an ordered range of all the add lab medical organ secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalOrganSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab medical organ secs
	 * @param end the upper bound of the range of add lab medical organ secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add lab medical organ secs
	 */
	public java.util.List<AddLabMedicalOrganSec> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddLabMedicalOrganSec>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the add lab medical organ secs from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of add lab medical organ secs.
	 *
	 * @return the number of add lab medical organ secs
	 */
	public int countAll();

}