/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAccCerBodyScopeException;
import com.nbp.janaac.application.form.service.model.AccCerBodyScope;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acc cer body scope service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyScopeUtil
 * @generated
 */
@ProviderType
public interface AccCerBodyScopePersistence
	extends BasePersistence<AccCerBodyScope> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AccCerBodyScopeUtil} to access the acc cer body scope persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the acc cer body scopes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acc cer body scopes
	 */
	public java.util.List<AccCerBodyScope> findByUuid(String uuid);

	/**
	 * Returns a range of all the acc cer body scopes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc cer body scopes
	 * @param end the upper bound of the range of acc cer body scopes (not inclusive)
	 * @return the range of matching acc cer body scopes
	 */
	public java.util.List<AccCerBodyScope> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the acc cer body scopes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc cer body scopes
	 * @param end the upper bound of the range of acc cer body scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc cer body scopes
	 */
	public java.util.List<AccCerBodyScope> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyScope>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acc cer body scopes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc cer body scopes
	 * @param end the upper bound of the range of acc cer body scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc cer body scopes
	 */
	public java.util.List<AccCerBodyScope> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyScope>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acc cer body scope in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc cer body scope
	 * @throws NoSuchAccCerBodyScopeException if a matching acc cer body scope could not be found
	 */
	public AccCerBodyScope findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyScope>
				orderByComparator)
		throws NoSuchAccCerBodyScopeException;

	/**
	 * Returns the first acc cer body scope in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc cer body scope, or <code>null</code> if a matching acc cer body scope could not be found
	 */
	public AccCerBodyScope fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyScope>
			orderByComparator);

	/**
	 * Returns the last acc cer body scope in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc cer body scope
	 * @throws NoSuchAccCerBodyScopeException if a matching acc cer body scope could not be found
	 */
	public AccCerBodyScope findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyScope>
				orderByComparator)
		throws NoSuchAccCerBodyScopeException;

	/**
	 * Returns the last acc cer body scope in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc cer body scope, or <code>null</code> if a matching acc cer body scope could not be found
	 */
	public AccCerBodyScope fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyScope>
			orderByComparator);

	/**
	 * Returns the acc cer body scopes before and after the current acc cer body scope in the ordered set where uuid = &#63;.
	 *
	 * @param accCerBodyScopeId the primary key of the current acc cer body scope
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc cer body scope
	 * @throws NoSuchAccCerBodyScopeException if a acc cer body scope with the primary key could not be found
	 */
	public AccCerBodyScope[] findByUuid_PrevAndNext(
			long accCerBodyScopeId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyScope>
				orderByComparator)
		throws NoSuchAccCerBodyScopeException;

	/**
	 * Removes all the acc cer body scopes where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of acc cer body scopes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acc cer body scopes
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the acc cer body scope where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAccCerBodyScopeException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc cer body scope
	 * @throws NoSuchAccCerBodyScopeException if a matching acc cer body scope could not be found
	 */
	public AccCerBodyScope findByUUID_G(String uuid, long groupId)
		throws NoSuchAccCerBodyScopeException;

	/**
	 * Returns the acc cer body scope where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc cer body scope, or <code>null</code> if a matching acc cer body scope could not be found
	 */
	public AccCerBodyScope fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the acc cer body scope where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc cer body scope, or <code>null</code> if a matching acc cer body scope could not be found
	 */
	public AccCerBodyScope fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the acc cer body scope where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acc cer body scope that was removed
	 */
	public AccCerBodyScope removeByUUID_G(String uuid, long groupId)
		throws NoSuchAccCerBodyScopeException;

	/**
	 * Returns the number of acc cer body scopes where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acc cer body scopes
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the acc cer body scopes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acc cer body scopes
	 */
	public java.util.List<AccCerBodyScope> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the acc cer body scopes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc cer body scopes
	 * @param end the upper bound of the range of acc cer body scopes (not inclusive)
	 * @return the range of matching acc cer body scopes
	 */
	public java.util.List<AccCerBodyScope> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the acc cer body scopes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc cer body scopes
	 * @param end the upper bound of the range of acc cer body scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc cer body scopes
	 */
	public java.util.List<AccCerBodyScope> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyScope>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acc cer body scopes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc cer body scopes
	 * @param end the upper bound of the range of acc cer body scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc cer body scopes
	 */
	public java.util.List<AccCerBodyScope> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyScope>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acc cer body scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc cer body scope
	 * @throws NoSuchAccCerBodyScopeException if a matching acc cer body scope could not be found
	 */
	public AccCerBodyScope findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyScope>
				orderByComparator)
		throws NoSuchAccCerBodyScopeException;

	/**
	 * Returns the first acc cer body scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc cer body scope, or <code>null</code> if a matching acc cer body scope could not be found
	 */
	public AccCerBodyScope fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyScope>
			orderByComparator);

	/**
	 * Returns the last acc cer body scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc cer body scope
	 * @throws NoSuchAccCerBodyScopeException if a matching acc cer body scope could not be found
	 */
	public AccCerBodyScope findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyScope>
				orderByComparator)
		throws NoSuchAccCerBodyScopeException;

	/**
	 * Returns the last acc cer body scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc cer body scope, or <code>null</code> if a matching acc cer body scope could not be found
	 */
	public AccCerBodyScope fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyScope>
			orderByComparator);

	/**
	 * Returns the acc cer body scopes before and after the current acc cer body scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param accCerBodyScopeId the primary key of the current acc cer body scope
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc cer body scope
	 * @throws NoSuchAccCerBodyScopeException if a acc cer body scope with the primary key could not be found
	 */
	public AccCerBodyScope[] findByUuid_C_PrevAndNext(
			long accCerBodyScopeId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyScope>
				orderByComparator)
		throws NoSuchAccCerBodyScopeException;

	/**
	 * Removes all the acc cer body scopes where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of acc cer body scopes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acc cer body scopes
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the acc cer body scope where janaacApplicationId = &#63; or throws a <code>NoSuchAccCerBodyScopeException</code> if it could not be found.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc cer body scope
	 * @throws NoSuchAccCerBodyScopeException if a matching acc cer body scope could not be found
	 */
	public AccCerBodyScope findBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccCerBodyScopeException;

	/**
	 * Returns the acc cer body scope where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc cer body scope, or <code>null</code> if a matching acc cer body scope could not be found
	 */
	public AccCerBodyScope fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId);

	/**
	 * Returns the acc cer body scope where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc cer body scope, or <code>null</code> if a matching acc cer body scope could not be found
	 */
	public AccCerBodyScope fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId, boolean useFinderCache);

	/**
	 * Removes the acc cer body scope where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the acc cer body scope that was removed
	 */
	public AccCerBodyScope removeBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccCerBodyScopeException;

	/**
	 * Returns the number of acc cer body scopes where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching acc cer body scopes
	 */
	public int countBygetJANAAC_ByApplicationId(long janaacApplicationId);

	/**
	 * Caches the acc cer body scope in the entity cache if it is enabled.
	 *
	 * @param accCerBodyScope the acc cer body scope
	 */
	public void cacheResult(AccCerBodyScope accCerBodyScope);

	/**
	 * Caches the acc cer body scopes in the entity cache if it is enabled.
	 *
	 * @param accCerBodyScopes the acc cer body scopes
	 */
	public void cacheResult(java.util.List<AccCerBodyScope> accCerBodyScopes);

	/**
	 * Creates a new acc cer body scope with the primary key. Does not add the acc cer body scope to the database.
	 *
	 * @param accCerBodyScopeId the primary key for the new acc cer body scope
	 * @return the new acc cer body scope
	 */
	public AccCerBodyScope create(long accCerBodyScopeId);

	/**
	 * Removes the acc cer body scope with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accCerBodyScopeId the primary key of the acc cer body scope
	 * @return the acc cer body scope that was removed
	 * @throws NoSuchAccCerBodyScopeException if a acc cer body scope with the primary key could not be found
	 */
	public AccCerBodyScope remove(long accCerBodyScopeId)
		throws NoSuchAccCerBodyScopeException;

	public AccCerBodyScope updateImpl(AccCerBodyScope accCerBodyScope);

	/**
	 * Returns the acc cer body scope with the primary key or throws a <code>NoSuchAccCerBodyScopeException</code> if it could not be found.
	 *
	 * @param accCerBodyScopeId the primary key of the acc cer body scope
	 * @return the acc cer body scope
	 * @throws NoSuchAccCerBodyScopeException if a acc cer body scope with the primary key could not be found
	 */
	public AccCerBodyScope findByPrimaryKey(long accCerBodyScopeId)
		throws NoSuchAccCerBodyScopeException;

	/**
	 * Returns the acc cer body scope with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accCerBodyScopeId the primary key of the acc cer body scope
	 * @return the acc cer body scope, or <code>null</code> if a acc cer body scope with the primary key could not be found
	 */
	public AccCerBodyScope fetchByPrimaryKey(long accCerBodyScopeId);

	/**
	 * Returns all the acc cer body scopes.
	 *
	 * @return the acc cer body scopes
	 */
	public java.util.List<AccCerBodyScope> findAll();

	/**
	 * Returns a range of all the acc cer body scopes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyScopeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc cer body scopes
	 * @param end the upper bound of the range of acc cer body scopes (not inclusive)
	 * @return the range of acc cer body scopes
	 */
	public java.util.List<AccCerBodyScope> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the acc cer body scopes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyScopeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc cer body scopes
	 * @param end the upper bound of the range of acc cer body scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acc cer body scopes
	 */
	public java.util.List<AccCerBodyScope> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyScope>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acc cer body scopes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyScopeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc cer body scopes
	 * @param end the upper bound of the range of acc cer body scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acc cer body scopes
	 */
	public java.util.List<AccCerBodyScope> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyScope>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acc cer body scopes from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acc cer body scopes.
	 *
	 * @return the number of acc cer body scopes
	 */
	public int countAll();

}