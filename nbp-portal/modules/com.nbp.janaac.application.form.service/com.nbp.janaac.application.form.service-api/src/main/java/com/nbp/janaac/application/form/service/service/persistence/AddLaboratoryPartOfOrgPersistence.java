/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAddLaboratoryPartOfOrgException;
import com.nbp.janaac.application.form.service.model.AddLaboratoryPartOfOrg;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the add laboratory part of org service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddLaboratoryPartOfOrgUtil
 * @generated
 */
@ProviderType
public interface AddLaboratoryPartOfOrgPersistence
	extends BasePersistence<AddLaboratoryPartOfOrg> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AddLaboratoryPartOfOrgUtil} to access the add laboratory part of org persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the add laboratory part of orgs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add laboratory part of orgs
	 */
	public java.util.List<AddLaboratoryPartOfOrg> findBygetJanaacByAppId(
		long janaacApplicationId);

	/**
	 * Returns a range of all the add laboratory part of orgs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLaboratoryPartOfOrgModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add laboratory part of orgs
	 * @param end the upper bound of the range of add laboratory part of orgs (not inclusive)
	 * @return the range of matching add laboratory part of orgs
	 */
	public java.util.List<AddLaboratoryPartOfOrg> findBygetJanaacByAppId(
		long janaacApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the add laboratory part of orgs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLaboratoryPartOfOrgModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add laboratory part of orgs
	 * @param end the upper bound of the range of add laboratory part of orgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add laboratory part of orgs
	 */
	public java.util.List<AddLaboratoryPartOfOrg> findBygetJanaacByAppId(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddLaboratoryPartOfOrg>
			orderByComparator);

	/**
	 * Returns an ordered range of all the add laboratory part of orgs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLaboratoryPartOfOrgModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add laboratory part of orgs
	 * @param end the upper bound of the range of add laboratory part of orgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add laboratory part of orgs
	 */
	public java.util.List<AddLaboratoryPartOfOrg> findBygetJanaacByAppId(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddLaboratoryPartOfOrg>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first add laboratory part of org in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add laboratory part of org
	 * @throws NoSuchAddLaboratoryPartOfOrgException if a matching add laboratory part of org could not be found
	 */
	public AddLaboratoryPartOfOrg findBygetJanaacByAppId_First(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddLaboratoryPartOfOrg> orderByComparator)
		throws NoSuchAddLaboratoryPartOfOrgException;

	/**
	 * Returns the first add laboratory part of org in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add laboratory part of org, or <code>null</code> if a matching add laboratory part of org could not be found
	 */
	public AddLaboratoryPartOfOrg fetchBygetJanaacByAppId_First(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AddLaboratoryPartOfOrg>
			orderByComparator);

	/**
	 * Returns the last add laboratory part of org in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add laboratory part of org
	 * @throws NoSuchAddLaboratoryPartOfOrgException if a matching add laboratory part of org could not be found
	 */
	public AddLaboratoryPartOfOrg findBygetJanaacByAppId_Last(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddLaboratoryPartOfOrg> orderByComparator)
		throws NoSuchAddLaboratoryPartOfOrgException;

	/**
	 * Returns the last add laboratory part of org in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add laboratory part of org, or <code>null</code> if a matching add laboratory part of org could not be found
	 */
	public AddLaboratoryPartOfOrg fetchBygetJanaacByAppId_Last(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AddLaboratoryPartOfOrg>
			orderByComparator);

	/**
	 * Returns the add laboratory part of orgs before and after the current add laboratory part of org in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addLaboratoryPartOfOrgId the primary key of the current add laboratory part of org
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add laboratory part of org
	 * @throws NoSuchAddLaboratoryPartOfOrgException if a add laboratory part of org with the primary key could not be found
	 */
	public AddLaboratoryPartOfOrg[] findBygetJanaacByAppId_PrevAndNext(
			long addLaboratoryPartOfOrgId, long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddLaboratoryPartOfOrg> orderByComparator)
		throws NoSuchAddLaboratoryPartOfOrgException;

	/**
	 * Removes all the add laboratory part of orgs where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public void removeBygetJanaacByAppId(long janaacApplicationId);

	/**
	 * Returns the number of add laboratory part of orgs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add laboratory part of orgs
	 */
	public int countBygetJanaacByAppId(long janaacApplicationId);

	/**
	 * Caches the add laboratory part of org in the entity cache if it is enabled.
	 *
	 * @param addLaboratoryPartOfOrg the add laboratory part of org
	 */
	public void cacheResult(AddLaboratoryPartOfOrg addLaboratoryPartOfOrg);

	/**
	 * Caches the add laboratory part of orgs in the entity cache if it is enabled.
	 *
	 * @param addLaboratoryPartOfOrgs the add laboratory part of orgs
	 */
	public void cacheResult(
		java.util.List<AddLaboratoryPartOfOrg> addLaboratoryPartOfOrgs);

	/**
	 * Creates a new add laboratory part of org with the primary key. Does not add the add laboratory part of org to the database.
	 *
	 * @param addLaboratoryPartOfOrgId the primary key for the new add laboratory part of org
	 * @return the new add laboratory part of org
	 */
	public AddLaboratoryPartOfOrg create(long addLaboratoryPartOfOrgId);

	/**
	 * Removes the add laboratory part of org with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addLaboratoryPartOfOrgId the primary key of the add laboratory part of org
	 * @return the add laboratory part of org that was removed
	 * @throws NoSuchAddLaboratoryPartOfOrgException if a add laboratory part of org with the primary key could not be found
	 */
	public AddLaboratoryPartOfOrg remove(long addLaboratoryPartOfOrgId)
		throws NoSuchAddLaboratoryPartOfOrgException;

	public AddLaboratoryPartOfOrg updateImpl(
		AddLaboratoryPartOfOrg addLaboratoryPartOfOrg);

	/**
	 * Returns the add laboratory part of org with the primary key or throws a <code>NoSuchAddLaboratoryPartOfOrgException</code> if it could not be found.
	 *
	 * @param addLaboratoryPartOfOrgId the primary key of the add laboratory part of org
	 * @return the add laboratory part of org
	 * @throws NoSuchAddLaboratoryPartOfOrgException if a add laboratory part of org with the primary key could not be found
	 */
	public AddLaboratoryPartOfOrg findByPrimaryKey(
			long addLaboratoryPartOfOrgId)
		throws NoSuchAddLaboratoryPartOfOrgException;

	/**
	 * Returns the add laboratory part of org with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addLaboratoryPartOfOrgId the primary key of the add laboratory part of org
	 * @return the add laboratory part of org, or <code>null</code> if a add laboratory part of org with the primary key could not be found
	 */
	public AddLaboratoryPartOfOrg fetchByPrimaryKey(
		long addLaboratoryPartOfOrgId);

	/**
	 * Returns all the add laboratory part of orgs.
	 *
	 * @return the add laboratory part of orgs
	 */
	public java.util.List<AddLaboratoryPartOfOrg> findAll();

	/**
	 * Returns a range of all the add laboratory part of orgs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLaboratoryPartOfOrgModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add laboratory part of orgs
	 * @param end the upper bound of the range of add laboratory part of orgs (not inclusive)
	 * @return the range of add laboratory part of orgs
	 */
	public java.util.List<AddLaboratoryPartOfOrg> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the add laboratory part of orgs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLaboratoryPartOfOrgModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add laboratory part of orgs
	 * @param end the upper bound of the range of add laboratory part of orgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add laboratory part of orgs
	 */
	public java.util.List<AddLaboratoryPartOfOrg> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddLaboratoryPartOfOrg>
			orderByComparator);

	/**
	 * Returns an ordered range of all the add laboratory part of orgs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLaboratoryPartOfOrgModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add laboratory part of orgs
	 * @param end the upper bound of the range of add laboratory part of orgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add laboratory part of orgs
	 */
	public java.util.List<AddLaboratoryPartOfOrg> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddLaboratoryPartOfOrg>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the add laboratory part of orgs from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of add laboratory part of orgs.
	 *
	 * @return the number of add laboratory part of orgs
	 */
	public int countAll();

}