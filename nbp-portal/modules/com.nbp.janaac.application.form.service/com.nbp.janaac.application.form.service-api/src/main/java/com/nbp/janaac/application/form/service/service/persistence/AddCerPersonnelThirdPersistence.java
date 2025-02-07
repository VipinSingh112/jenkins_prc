/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAddCerPersonnelThirdException;
import com.nbp.janaac.application.form.service.model.AddCerPersonnelThird;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the add cer personnel third service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddCerPersonnelThirdUtil
 * @generated
 */
@ProviderType
public interface AddCerPersonnelThirdPersistence
	extends BasePersistence<AddCerPersonnelThird> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AddCerPersonnelThirdUtil} to access the add cer personnel third persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the add cer personnel thirds where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add cer personnel thirds
	 */
	public java.util.List<AddCerPersonnelThird> findBygetJanaacById(
		long janaacApplicationId);

	/**
	 * Returns a range of all the add cer personnel thirds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerPersonnelThirdModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add cer personnel thirds
	 * @param end the upper bound of the range of add cer personnel thirds (not inclusive)
	 * @return the range of matching add cer personnel thirds
	 */
	public java.util.List<AddCerPersonnelThird> findBygetJanaacById(
		long janaacApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the add cer personnel thirds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerPersonnelThirdModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add cer personnel thirds
	 * @param end the upper bound of the range of add cer personnel thirds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add cer personnel thirds
	 */
	public java.util.List<AddCerPersonnelThird> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddCerPersonnelThird>
			orderByComparator);

	/**
	 * Returns an ordered range of all the add cer personnel thirds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerPersonnelThirdModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add cer personnel thirds
	 * @param end the upper bound of the range of add cer personnel thirds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add cer personnel thirds
	 */
	public java.util.List<AddCerPersonnelThird> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddCerPersonnelThird>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first add cer personnel third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add cer personnel third
	 * @throws NoSuchAddCerPersonnelThirdException if a matching add cer personnel third could not be found
	 */
	public AddCerPersonnelThird findBygetJanaacById_First(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddCerPersonnelThird> orderByComparator)
		throws NoSuchAddCerPersonnelThirdException;

	/**
	 * Returns the first add cer personnel third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add cer personnel third, or <code>null</code> if a matching add cer personnel third could not be found
	 */
	public AddCerPersonnelThird fetchBygetJanaacById_First(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AddCerPersonnelThird>
			orderByComparator);

	/**
	 * Returns the last add cer personnel third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add cer personnel third
	 * @throws NoSuchAddCerPersonnelThirdException if a matching add cer personnel third could not be found
	 */
	public AddCerPersonnelThird findBygetJanaacById_Last(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddCerPersonnelThird> orderByComparator)
		throws NoSuchAddCerPersonnelThirdException;

	/**
	 * Returns the last add cer personnel third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add cer personnel third, or <code>null</code> if a matching add cer personnel third could not be found
	 */
	public AddCerPersonnelThird fetchBygetJanaacById_Last(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AddCerPersonnelThird>
			orderByComparator);

	/**
	 * Returns the add cer personnel thirds before and after the current add cer personnel third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addCerPersonnelThirdId the primary key of the current add cer personnel third
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add cer personnel third
	 * @throws NoSuchAddCerPersonnelThirdException if a add cer personnel third with the primary key could not be found
	 */
	public AddCerPersonnelThird[] findBygetJanaacById_PrevAndNext(
			long addCerPersonnelThirdId, long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddCerPersonnelThird> orderByComparator)
		throws NoSuchAddCerPersonnelThirdException;

	/**
	 * Removes all the add cer personnel thirds where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public void removeBygetJanaacById(long janaacApplicationId);

	/**
	 * Returns the number of add cer personnel thirds where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add cer personnel thirds
	 */
	public int countBygetJanaacById(long janaacApplicationId);

	/**
	 * Caches the add cer personnel third in the entity cache if it is enabled.
	 *
	 * @param addCerPersonnelThird the add cer personnel third
	 */
	public void cacheResult(AddCerPersonnelThird addCerPersonnelThird);

	/**
	 * Caches the add cer personnel thirds in the entity cache if it is enabled.
	 *
	 * @param addCerPersonnelThirds the add cer personnel thirds
	 */
	public void cacheResult(
		java.util.List<AddCerPersonnelThird> addCerPersonnelThirds);

	/**
	 * Creates a new add cer personnel third with the primary key. Does not add the add cer personnel third to the database.
	 *
	 * @param addCerPersonnelThirdId the primary key for the new add cer personnel third
	 * @return the new add cer personnel third
	 */
	public AddCerPersonnelThird create(long addCerPersonnelThirdId);

	/**
	 * Removes the add cer personnel third with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addCerPersonnelThirdId the primary key of the add cer personnel third
	 * @return the add cer personnel third that was removed
	 * @throws NoSuchAddCerPersonnelThirdException if a add cer personnel third with the primary key could not be found
	 */
	public AddCerPersonnelThird remove(long addCerPersonnelThirdId)
		throws NoSuchAddCerPersonnelThirdException;

	public AddCerPersonnelThird updateImpl(
		AddCerPersonnelThird addCerPersonnelThird);

	/**
	 * Returns the add cer personnel third with the primary key or throws a <code>NoSuchAddCerPersonnelThirdException</code> if it could not be found.
	 *
	 * @param addCerPersonnelThirdId the primary key of the add cer personnel third
	 * @return the add cer personnel third
	 * @throws NoSuchAddCerPersonnelThirdException if a add cer personnel third with the primary key could not be found
	 */
	public AddCerPersonnelThird findByPrimaryKey(long addCerPersonnelThirdId)
		throws NoSuchAddCerPersonnelThirdException;

	/**
	 * Returns the add cer personnel third with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addCerPersonnelThirdId the primary key of the add cer personnel third
	 * @return the add cer personnel third, or <code>null</code> if a add cer personnel third with the primary key could not be found
	 */
	public AddCerPersonnelThird fetchByPrimaryKey(long addCerPersonnelThirdId);

	/**
	 * Returns all the add cer personnel thirds.
	 *
	 * @return the add cer personnel thirds
	 */
	public java.util.List<AddCerPersonnelThird> findAll();

	/**
	 * Returns a range of all the add cer personnel thirds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerPersonnelThirdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer personnel thirds
	 * @param end the upper bound of the range of add cer personnel thirds (not inclusive)
	 * @return the range of add cer personnel thirds
	 */
	public java.util.List<AddCerPersonnelThird> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the add cer personnel thirds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerPersonnelThirdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer personnel thirds
	 * @param end the upper bound of the range of add cer personnel thirds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add cer personnel thirds
	 */
	public java.util.List<AddCerPersonnelThird> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddCerPersonnelThird>
			orderByComparator);

	/**
	 * Returns an ordered range of all the add cer personnel thirds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerPersonnelThirdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer personnel thirds
	 * @param end the upper bound of the range of add cer personnel thirds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add cer personnel thirds
	 */
	public java.util.List<AddCerPersonnelThird> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddCerPersonnelThird>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the add cer personnel thirds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of add cer personnel thirds.
	 *
	 * @return the number of add cer personnel thirds
	 */
	public int countAll();

}