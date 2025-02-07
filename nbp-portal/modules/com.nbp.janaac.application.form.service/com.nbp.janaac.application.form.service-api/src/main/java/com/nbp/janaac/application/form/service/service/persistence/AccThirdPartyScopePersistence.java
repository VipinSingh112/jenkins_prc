/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAccThirdPartyScopeException;
import com.nbp.janaac.application.form.service.model.AccThirdPartyScope;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acc third party scope service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccThirdPartyScopeUtil
 * @generated
 */
@ProviderType
public interface AccThirdPartyScopePersistence
	extends BasePersistence<AccThirdPartyScope> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AccThirdPartyScopeUtil} to access the acc third party scope persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the acc third party scopes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acc third party scopes
	 */
	public java.util.List<AccThirdPartyScope> findByUuid(String uuid);

	/**
	 * Returns a range of all the acc third party scopes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccThirdPartyScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc third party scopes
	 * @param end the upper bound of the range of acc third party scopes (not inclusive)
	 * @return the range of matching acc third party scopes
	 */
	public java.util.List<AccThirdPartyScope> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the acc third party scopes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccThirdPartyScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc third party scopes
	 * @param end the upper bound of the range of acc third party scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc third party scopes
	 */
	public java.util.List<AccThirdPartyScope> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccThirdPartyScope>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acc third party scopes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccThirdPartyScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc third party scopes
	 * @param end the upper bound of the range of acc third party scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc third party scopes
	 */
	public java.util.List<AccThirdPartyScope> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccThirdPartyScope>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acc third party scope in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc third party scope
	 * @throws NoSuchAccThirdPartyScopeException if a matching acc third party scope could not be found
	 */
	public AccThirdPartyScope findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<AccThirdPartyScope>
				orderByComparator)
		throws NoSuchAccThirdPartyScopeException;

	/**
	 * Returns the first acc third party scope in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc third party scope, or <code>null</code> if a matching acc third party scope could not be found
	 */
	public AccThirdPartyScope fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AccThirdPartyScope>
			orderByComparator);

	/**
	 * Returns the last acc third party scope in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc third party scope
	 * @throws NoSuchAccThirdPartyScopeException if a matching acc third party scope could not be found
	 */
	public AccThirdPartyScope findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<AccThirdPartyScope>
				orderByComparator)
		throws NoSuchAccThirdPartyScopeException;

	/**
	 * Returns the last acc third party scope in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc third party scope, or <code>null</code> if a matching acc third party scope could not be found
	 */
	public AccThirdPartyScope fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AccThirdPartyScope>
			orderByComparator);

	/**
	 * Returns the acc third party scopes before and after the current acc third party scope in the ordered set where uuid = &#63;.
	 *
	 * @param accThirdPartyScopeId the primary key of the current acc third party scope
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc third party scope
	 * @throws NoSuchAccThirdPartyScopeException if a acc third party scope with the primary key could not be found
	 */
	public AccThirdPartyScope[] findByUuid_PrevAndNext(
			long accThirdPartyScopeId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<AccThirdPartyScope>
				orderByComparator)
		throws NoSuchAccThirdPartyScopeException;

	/**
	 * Removes all the acc third party scopes where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of acc third party scopes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acc third party scopes
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the acc third party scope where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAccThirdPartyScopeException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc third party scope
	 * @throws NoSuchAccThirdPartyScopeException if a matching acc third party scope could not be found
	 */
	public AccThirdPartyScope findByUUID_G(String uuid, long groupId)
		throws NoSuchAccThirdPartyScopeException;

	/**
	 * Returns the acc third party scope where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc third party scope, or <code>null</code> if a matching acc third party scope could not be found
	 */
	public AccThirdPartyScope fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the acc third party scope where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc third party scope, or <code>null</code> if a matching acc third party scope could not be found
	 */
	public AccThirdPartyScope fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the acc third party scope where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acc third party scope that was removed
	 */
	public AccThirdPartyScope removeByUUID_G(String uuid, long groupId)
		throws NoSuchAccThirdPartyScopeException;

	/**
	 * Returns the number of acc third party scopes where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acc third party scopes
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the acc third party scopes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acc third party scopes
	 */
	public java.util.List<AccThirdPartyScope> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the acc third party scopes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccThirdPartyScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc third party scopes
	 * @param end the upper bound of the range of acc third party scopes (not inclusive)
	 * @return the range of matching acc third party scopes
	 */
	public java.util.List<AccThirdPartyScope> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the acc third party scopes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccThirdPartyScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc third party scopes
	 * @param end the upper bound of the range of acc third party scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc third party scopes
	 */
	public java.util.List<AccThirdPartyScope> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccThirdPartyScope>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acc third party scopes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccThirdPartyScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc third party scopes
	 * @param end the upper bound of the range of acc third party scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc third party scopes
	 */
	public java.util.List<AccThirdPartyScope> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccThirdPartyScope>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acc third party scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc third party scope
	 * @throws NoSuchAccThirdPartyScopeException if a matching acc third party scope could not be found
	 */
	public AccThirdPartyScope findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<AccThirdPartyScope>
				orderByComparator)
		throws NoSuchAccThirdPartyScopeException;

	/**
	 * Returns the first acc third party scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc third party scope, or <code>null</code> if a matching acc third party scope could not be found
	 */
	public AccThirdPartyScope fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AccThirdPartyScope>
			orderByComparator);

	/**
	 * Returns the last acc third party scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc third party scope
	 * @throws NoSuchAccThirdPartyScopeException if a matching acc third party scope could not be found
	 */
	public AccThirdPartyScope findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<AccThirdPartyScope>
				orderByComparator)
		throws NoSuchAccThirdPartyScopeException;

	/**
	 * Returns the last acc third party scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc third party scope, or <code>null</code> if a matching acc third party scope could not be found
	 */
	public AccThirdPartyScope fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AccThirdPartyScope>
			orderByComparator);

	/**
	 * Returns the acc third party scopes before and after the current acc third party scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param accThirdPartyScopeId the primary key of the current acc third party scope
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc third party scope
	 * @throws NoSuchAccThirdPartyScopeException if a acc third party scope with the primary key could not be found
	 */
	public AccThirdPartyScope[] findByUuid_C_PrevAndNext(
			long accThirdPartyScopeId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<AccThirdPartyScope>
				orderByComparator)
		throws NoSuchAccThirdPartyScopeException;

	/**
	 * Removes all the acc third party scopes where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of acc third party scopes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acc third party scopes
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the acc third party scope where janaacApplicationId = &#63; or throws a <code>NoSuchAccThirdPartyScopeException</code> if it could not be found.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc third party scope
	 * @throws NoSuchAccThirdPartyScopeException if a matching acc third party scope could not be found
	 */
	public AccThirdPartyScope findBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccThirdPartyScopeException;

	/**
	 * Returns the acc third party scope where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc third party scope, or <code>null</code> if a matching acc third party scope could not be found
	 */
	public AccThirdPartyScope fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId);

	/**
	 * Returns the acc third party scope where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc third party scope, or <code>null</code> if a matching acc third party scope could not be found
	 */
	public AccThirdPartyScope fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId, boolean useFinderCache);

	/**
	 * Removes the acc third party scope where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the acc third party scope that was removed
	 */
	public AccThirdPartyScope removeBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccThirdPartyScopeException;

	/**
	 * Returns the number of acc third party scopes where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching acc third party scopes
	 */
	public int countBygetJANAAC_ByApplicationId(long janaacApplicationId);

	/**
	 * Caches the acc third party scope in the entity cache if it is enabled.
	 *
	 * @param accThirdPartyScope the acc third party scope
	 */
	public void cacheResult(AccThirdPartyScope accThirdPartyScope);

	/**
	 * Caches the acc third party scopes in the entity cache if it is enabled.
	 *
	 * @param accThirdPartyScopes the acc third party scopes
	 */
	public void cacheResult(
		java.util.List<AccThirdPartyScope> accThirdPartyScopes);

	/**
	 * Creates a new acc third party scope with the primary key. Does not add the acc third party scope to the database.
	 *
	 * @param accThirdPartyScopeId the primary key for the new acc third party scope
	 * @return the new acc third party scope
	 */
	public AccThirdPartyScope create(long accThirdPartyScopeId);

	/**
	 * Removes the acc third party scope with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accThirdPartyScopeId the primary key of the acc third party scope
	 * @return the acc third party scope that was removed
	 * @throws NoSuchAccThirdPartyScopeException if a acc third party scope with the primary key could not be found
	 */
	public AccThirdPartyScope remove(long accThirdPartyScopeId)
		throws NoSuchAccThirdPartyScopeException;

	public AccThirdPartyScope updateImpl(AccThirdPartyScope accThirdPartyScope);

	/**
	 * Returns the acc third party scope with the primary key or throws a <code>NoSuchAccThirdPartyScopeException</code> if it could not be found.
	 *
	 * @param accThirdPartyScopeId the primary key of the acc third party scope
	 * @return the acc third party scope
	 * @throws NoSuchAccThirdPartyScopeException if a acc third party scope with the primary key could not be found
	 */
	public AccThirdPartyScope findByPrimaryKey(long accThirdPartyScopeId)
		throws NoSuchAccThirdPartyScopeException;

	/**
	 * Returns the acc third party scope with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accThirdPartyScopeId the primary key of the acc third party scope
	 * @return the acc third party scope, or <code>null</code> if a acc third party scope with the primary key could not be found
	 */
	public AccThirdPartyScope fetchByPrimaryKey(long accThirdPartyScopeId);

	/**
	 * Returns all the acc third party scopes.
	 *
	 * @return the acc third party scopes
	 */
	public java.util.List<AccThirdPartyScope> findAll();

	/**
	 * Returns a range of all the acc third party scopes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccThirdPartyScopeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc third party scopes
	 * @param end the upper bound of the range of acc third party scopes (not inclusive)
	 * @return the range of acc third party scopes
	 */
	public java.util.List<AccThirdPartyScope> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the acc third party scopes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccThirdPartyScopeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc third party scopes
	 * @param end the upper bound of the range of acc third party scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acc third party scopes
	 */
	public java.util.List<AccThirdPartyScope> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccThirdPartyScope>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acc third party scopes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccThirdPartyScopeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc third party scopes
	 * @param end the upper bound of the range of acc third party scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acc third party scopes
	 */
	public java.util.List<AccThirdPartyScope> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccThirdPartyScope>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acc third party scopes from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acc third party scopes.
	 *
	 * @return the number of acc third party scopes
	 */
	public int countAll();

}