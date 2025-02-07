/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAddLabMedicalPhysicalFirstException;
import com.nbp.janaac.application.form.service.model.AddLabMedicalPhysicalFirst;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the add lab medical physical first service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddLabMedicalPhysicalFirstUtil
 * @generated
 */
@ProviderType
public interface AddLabMedicalPhysicalFirstPersistence
	extends BasePersistence<AddLabMedicalPhysicalFirst> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AddLabMedicalPhysicalFirstUtil} to access the add lab medical physical first persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the add lab medical physical firsts where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add lab medical physical firsts
	 */
	public java.util.List<AddLabMedicalPhysicalFirst> findBygetJanaacById(
		long janaacApplicationId);

	/**
	 * Returns a range of all the add lab medical physical firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalPhysicalFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab medical physical firsts
	 * @param end the upper bound of the range of add lab medical physical firsts (not inclusive)
	 * @return the range of matching add lab medical physical firsts
	 */
	public java.util.List<AddLabMedicalPhysicalFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the add lab medical physical firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalPhysicalFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab medical physical firsts
	 * @param end the upper bound of the range of add lab medical physical firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add lab medical physical firsts
	 */
	public java.util.List<AddLabMedicalPhysicalFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddLabMedicalPhysicalFirst> orderByComparator);

	/**
	 * Returns an ordered range of all the add lab medical physical firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalPhysicalFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab medical physical firsts
	 * @param end the upper bound of the range of add lab medical physical firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add lab medical physical firsts
	 */
	public java.util.List<AddLabMedicalPhysicalFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddLabMedicalPhysicalFirst> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first add lab medical physical first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab medical physical first
	 * @throws NoSuchAddLabMedicalPhysicalFirstException if a matching add lab medical physical first could not be found
	 */
	public AddLabMedicalPhysicalFirst findBygetJanaacById_First(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddLabMedicalPhysicalFirst> orderByComparator)
		throws NoSuchAddLabMedicalPhysicalFirstException;

	/**
	 * Returns the first add lab medical physical first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab medical physical first, or <code>null</code> if a matching add lab medical physical first could not be found
	 */
	public AddLabMedicalPhysicalFirst fetchBygetJanaacById_First(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddLabMedicalPhysicalFirst> orderByComparator);

	/**
	 * Returns the last add lab medical physical first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab medical physical first
	 * @throws NoSuchAddLabMedicalPhysicalFirstException if a matching add lab medical physical first could not be found
	 */
	public AddLabMedicalPhysicalFirst findBygetJanaacById_Last(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddLabMedicalPhysicalFirst> orderByComparator)
		throws NoSuchAddLabMedicalPhysicalFirstException;

	/**
	 * Returns the last add lab medical physical first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab medical physical first, or <code>null</code> if a matching add lab medical physical first could not be found
	 */
	public AddLabMedicalPhysicalFirst fetchBygetJanaacById_Last(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddLabMedicalPhysicalFirst> orderByComparator);

	/**
	 * Returns the add lab medical physical firsts before and after the current add lab medical physical first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addLabMedicalPhysicalFirstId the primary key of the current add lab medical physical first
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add lab medical physical first
	 * @throws NoSuchAddLabMedicalPhysicalFirstException if a add lab medical physical first with the primary key could not be found
	 */
	public AddLabMedicalPhysicalFirst[] findBygetJanaacById_PrevAndNext(
			long addLabMedicalPhysicalFirstId, long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddLabMedicalPhysicalFirst> orderByComparator)
		throws NoSuchAddLabMedicalPhysicalFirstException;

	/**
	 * Removes all the add lab medical physical firsts where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public void removeBygetJanaacById(long janaacApplicationId);

	/**
	 * Returns the number of add lab medical physical firsts where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add lab medical physical firsts
	 */
	public int countBygetJanaacById(long janaacApplicationId);

	/**
	 * Caches the add lab medical physical first in the entity cache if it is enabled.
	 *
	 * @param addLabMedicalPhysicalFirst the add lab medical physical first
	 */
	public void cacheResult(
		AddLabMedicalPhysicalFirst addLabMedicalPhysicalFirst);

	/**
	 * Caches the add lab medical physical firsts in the entity cache if it is enabled.
	 *
	 * @param addLabMedicalPhysicalFirsts the add lab medical physical firsts
	 */
	public void cacheResult(
		java.util.List<AddLabMedicalPhysicalFirst> addLabMedicalPhysicalFirsts);

	/**
	 * Creates a new add lab medical physical first with the primary key. Does not add the add lab medical physical first to the database.
	 *
	 * @param addLabMedicalPhysicalFirstId the primary key for the new add lab medical physical first
	 * @return the new add lab medical physical first
	 */
	public AddLabMedicalPhysicalFirst create(long addLabMedicalPhysicalFirstId);

	/**
	 * Removes the add lab medical physical first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addLabMedicalPhysicalFirstId the primary key of the add lab medical physical first
	 * @return the add lab medical physical first that was removed
	 * @throws NoSuchAddLabMedicalPhysicalFirstException if a add lab medical physical first with the primary key could not be found
	 */
	public AddLabMedicalPhysicalFirst remove(long addLabMedicalPhysicalFirstId)
		throws NoSuchAddLabMedicalPhysicalFirstException;

	public AddLabMedicalPhysicalFirst updateImpl(
		AddLabMedicalPhysicalFirst addLabMedicalPhysicalFirst);

	/**
	 * Returns the add lab medical physical first with the primary key or throws a <code>NoSuchAddLabMedicalPhysicalFirstException</code> if it could not be found.
	 *
	 * @param addLabMedicalPhysicalFirstId the primary key of the add lab medical physical first
	 * @return the add lab medical physical first
	 * @throws NoSuchAddLabMedicalPhysicalFirstException if a add lab medical physical first with the primary key could not be found
	 */
	public AddLabMedicalPhysicalFirst findByPrimaryKey(
			long addLabMedicalPhysicalFirstId)
		throws NoSuchAddLabMedicalPhysicalFirstException;

	/**
	 * Returns the add lab medical physical first with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addLabMedicalPhysicalFirstId the primary key of the add lab medical physical first
	 * @return the add lab medical physical first, or <code>null</code> if a add lab medical physical first with the primary key could not be found
	 */
	public AddLabMedicalPhysicalFirst fetchByPrimaryKey(
		long addLabMedicalPhysicalFirstId);

	/**
	 * Returns all the add lab medical physical firsts.
	 *
	 * @return the add lab medical physical firsts
	 */
	public java.util.List<AddLabMedicalPhysicalFirst> findAll();

	/**
	 * Returns a range of all the add lab medical physical firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalPhysicalFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab medical physical firsts
	 * @param end the upper bound of the range of add lab medical physical firsts (not inclusive)
	 * @return the range of add lab medical physical firsts
	 */
	public java.util.List<AddLabMedicalPhysicalFirst> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the add lab medical physical firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalPhysicalFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab medical physical firsts
	 * @param end the upper bound of the range of add lab medical physical firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add lab medical physical firsts
	 */
	public java.util.List<AddLabMedicalPhysicalFirst> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddLabMedicalPhysicalFirst> orderByComparator);

	/**
	 * Returns an ordered range of all the add lab medical physical firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalPhysicalFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab medical physical firsts
	 * @param end the upper bound of the range of add lab medical physical firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add lab medical physical firsts
	 */
	public java.util.List<AddLabMedicalPhysicalFirst> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddLabMedicalPhysicalFirst> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the add lab medical physical firsts from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of add lab medical physical firsts.
	 *
	 * @return the number of add lab medical physical firsts
	 */
	public int countAll();

}