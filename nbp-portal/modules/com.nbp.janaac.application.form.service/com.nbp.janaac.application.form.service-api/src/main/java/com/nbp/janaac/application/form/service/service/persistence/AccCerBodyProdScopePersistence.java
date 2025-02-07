/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAccCerBodyProdScopeException;
import com.nbp.janaac.application.form.service.model.AccCerBodyProdScope;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acc cer body prod scope service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyProdScopeUtil
 * @generated
 */
@ProviderType
public interface AccCerBodyProdScopePersistence
	extends BasePersistence<AccCerBodyProdScope> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AccCerBodyProdScopeUtil} to access the acc cer body prod scope persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the acc cer body prod scopes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acc cer body prod scopes
	 */
	public java.util.List<AccCerBodyProdScope> findByUuid(String uuid);

	/**
	 * Returns a range of all the acc cer body prod scopes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyProdScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc cer body prod scopes
	 * @param end the upper bound of the range of acc cer body prod scopes (not inclusive)
	 * @return the range of matching acc cer body prod scopes
	 */
	public java.util.List<AccCerBodyProdScope> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the acc cer body prod scopes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyProdScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc cer body prod scopes
	 * @param end the upper bound of the range of acc cer body prod scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc cer body prod scopes
	 */
	public java.util.List<AccCerBodyProdScope> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyProdScope>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acc cer body prod scopes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyProdScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc cer body prod scopes
	 * @param end the upper bound of the range of acc cer body prod scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc cer body prod scopes
	 */
	public java.util.List<AccCerBodyProdScope> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyProdScope>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acc cer body prod scope in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc cer body prod scope
	 * @throws NoSuchAccCerBodyProdScopeException if a matching acc cer body prod scope could not be found
	 */
	public AccCerBodyProdScope findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccCerBodyProdScope> orderByComparator)
		throws NoSuchAccCerBodyProdScopeException;

	/**
	 * Returns the first acc cer body prod scope in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc cer body prod scope, or <code>null</code> if a matching acc cer body prod scope could not be found
	 */
	public AccCerBodyProdScope fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyProdScope>
			orderByComparator);

	/**
	 * Returns the last acc cer body prod scope in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc cer body prod scope
	 * @throws NoSuchAccCerBodyProdScopeException if a matching acc cer body prod scope could not be found
	 */
	public AccCerBodyProdScope findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccCerBodyProdScope> orderByComparator)
		throws NoSuchAccCerBodyProdScopeException;

	/**
	 * Returns the last acc cer body prod scope in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc cer body prod scope, or <code>null</code> if a matching acc cer body prod scope could not be found
	 */
	public AccCerBodyProdScope fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyProdScope>
			orderByComparator);

	/**
	 * Returns the acc cer body prod scopes before and after the current acc cer body prod scope in the ordered set where uuid = &#63;.
	 *
	 * @param accCerBodyProdScopeId the primary key of the current acc cer body prod scope
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc cer body prod scope
	 * @throws NoSuchAccCerBodyProdScopeException if a acc cer body prod scope with the primary key could not be found
	 */
	public AccCerBodyProdScope[] findByUuid_PrevAndNext(
			long accCerBodyProdScopeId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccCerBodyProdScope> orderByComparator)
		throws NoSuchAccCerBodyProdScopeException;

	/**
	 * Removes all the acc cer body prod scopes where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of acc cer body prod scopes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acc cer body prod scopes
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the acc cer body prod scope where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAccCerBodyProdScopeException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc cer body prod scope
	 * @throws NoSuchAccCerBodyProdScopeException if a matching acc cer body prod scope could not be found
	 */
	public AccCerBodyProdScope findByUUID_G(String uuid, long groupId)
		throws NoSuchAccCerBodyProdScopeException;

	/**
	 * Returns the acc cer body prod scope where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc cer body prod scope, or <code>null</code> if a matching acc cer body prod scope could not be found
	 */
	public AccCerBodyProdScope fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the acc cer body prod scope where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc cer body prod scope, or <code>null</code> if a matching acc cer body prod scope could not be found
	 */
	public AccCerBodyProdScope fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the acc cer body prod scope where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acc cer body prod scope that was removed
	 */
	public AccCerBodyProdScope removeByUUID_G(String uuid, long groupId)
		throws NoSuchAccCerBodyProdScopeException;

	/**
	 * Returns the number of acc cer body prod scopes where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acc cer body prod scopes
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the acc cer body prod scopes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acc cer body prod scopes
	 */
	public java.util.List<AccCerBodyProdScope> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the acc cer body prod scopes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyProdScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc cer body prod scopes
	 * @param end the upper bound of the range of acc cer body prod scopes (not inclusive)
	 * @return the range of matching acc cer body prod scopes
	 */
	public java.util.List<AccCerBodyProdScope> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the acc cer body prod scopes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyProdScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc cer body prod scopes
	 * @param end the upper bound of the range of acc cer body prod scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc cer body prod scopes
	 */
	public java.util.List<AccCerBodyProdScope> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyProdScope>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acc cer body prod scopes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyProdScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc cer body prod scopes
	 * @param end the upper bound of the range of acc cer body prod scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc cer body prod scopes
	 */
	public java.util.List<AccCerBodyProdScope> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyProdScope>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acc cer body prod scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc cer body prod scope
	 * @throws NoSuchAccCerBodyProdScopeException if a matching acc cer body prod scope could not be found
	 */
	public AccCerBodyProdScope findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccCerBodyProdScope> orderByComparator)
		throws NoSuchAccCerBodyProdScopeException;

	/**
	 * Returns the first acc cer body prod scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc cer body prod scope, or <code>null</code> if a matching acc cer body prod scope could not be found
	 */
	public AccCerBodyProdScope fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyProdScope>
			orderByComparator);

	/**
	 * Returns the last acc cer body prod scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc cer body prod scope
	 * @throws NoSuchAccCerBodyProdScopeException if a matching acc cer body prod scope could not be found
	 */
	public AccCerBodyProdScope findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccCerBodyProdScope> orderByComparator)
		throws NoSuchAccCerBodyProdScopeException;

	/**
	 * Returns the last acc cer body prod scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc cer body prod scope, or <code>null</code> if a matching acc cer body prod scope could not be found
	 */
	public AccCerBodyProdScope fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyProdScope>
			orderByComparator);

	/**
	 * Returns the acc cer body prod scopes before and after the current acc cer body prod scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param accCerBodyProdScopeId the primary key of the current acc cer body prod scope
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc cer body prod scope
	 * @throws NoSuchAccCerBodyProdScopeException if a acc cer body prod scope with the primary key could not be found
	 */
	public AccCerBodyProdScope[] findByUuid_C_PrevAndNext(
			long accCerBodyProdScopeId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccCerBodyProdScope> orderByComparator)
		throws NoSuchAccCerBodyProdScopeException;

	/**
	 * Removes all the acc cer body prod scopes where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of acc cer body prod scopes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acc cer body prod scopes
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the acc cer body prod scope where janaacApplicationId = &#63; or throws a <code>NoSuchAccCerBodyProdScopeException</code> if it could not be found.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc cer body prod scope
	 * @throws NoSuchAccCerBodyProdScopeException if a matching acc cer body prod scope could not be found
	 */
	public AccCerBodyProdScope findBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccCerBodyProdScopeException;

	/**
	 * Returns the acc cer body prod scope where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc cer body prod scope, or <code>null</code> if a matching acc cer body prod scope could not be found
	 */
	public AccCerBodyProdScope fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId);

	/**
	 * Returns the acc cer body prod scope where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc cer body prod scope, or <code>null</code> if a matching acc cer body prod scope could not be found
	 */
	public AccCerBodyProdScope fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId, boolean useFinderCache);

	/**
	 * Removes the acc cer body prod scope where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the acc cer body prod scope that was removed
	 */
	public AccCerBodyProdScope removeBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccCerBodyProdScopeException;

	/**
	 * Returns the number of acc cer body prod scopes where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching acc cer body prod scopes
	 */
	public int countBygetJANAAC_ByApplicationId(long janaacApplicationId);

	/**
	 * Caches the acc cer body prod scope in the entity cache if it is enabled.
	 *
	 * @param accCerBodyProdScope the acc cer body prod scope
	 */
	public void cacheResult(AccCerBodyProdScope accCerBodyProdScope);

	/**
	 * Caches the acc cer body prod scopes in the entity cache if it is enabled.
	 *
	 * @param accCerBodyProdScopes the acc cer body prod scopes
	 */
	public void cacheResult(
		java.util.List<AccCerBodyProdScope> accCerBodyProdScopes);

	/**
	 * Creates a new acc cer body prod scope with the primary key. Does not add the acc cer body prod scope to the database.
	 *
	 * @param accCerBodyProdScopeId the primary key for the new acc cer body prod scope
	 * @return the new acc cer body prod scope
	 */
	public AccCerBodyProdScope create(long accCerBodyProdScopeId);

	/**
	 * Removes the acc cer body prod scope with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accCerBodyProdScopeId the primary key of the acc cer body prod scope
	 * @return the acc cer body prod scope that was removed
	 * @throws NoSuchAccCerBodyProdScopeException if a acc cer body prod scope with the primary key could not be found
	 */
	public AccCerBodyProdScope remove(long accCerBodyProdScopeId)
		throws NoSuchAccCerBodyProdScopeException;

	public AccCerBodyProdScope updateImpl(
		AccCerBodyProdScope accCerBodyProdScope);

	/**
	 * Returns the acc cer body prod scope with the primary key or throws a <code>NoSuchAccCerBodyProdScopeException</code> if it could not be found.
	 *
	 * @param accCerBodyProdScopeId the primary key of the acc cer body prod scope
	 * @return the acc cer body prod scope
	 * @throws NoSuchAccCerBodyProdScopeException if a acc cer body prod scope with the primary key could not be found
	 */
	public AccCerBodyProdScope findByPrimaryKey(long accCerBodyProdScopeId)
		throws NoSuchAccCerBodyProdScopeException;

	/**
	 * Returns the acc cer body prod scope with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accCerBodyProdScopeId the primary key of the acc cer body prod scope
	 * @return the acc cer body prod scope, or <code>null</code> if a acc cer body prod scope with the primary key could not be found
	 */
	public AccCerBodyProdScope fetchByPrimaryKey(long accCerBodyProdScopeId);

	/**
	 * Returns all the acc cer body prod scopes.
	 *
	 * @return the acc cer body prod scopes
	 */
	public java.util.List<AccCerBodyProdScope> findAll();

	/**
	 * Returns a range of all the acc cer body prod scopes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyProdScopeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc cer body prod scopes
	 * @param end the upper bound of the range of acc cer body prod scopes (not inclusive)
	 * @return the range of acc cer body prod scopes
	 */
	public java.util.List<AccCerBodyProdScope> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the acc cer body prod scopes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyProdScopeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc cer body prod scopes
	 * @param end the upper bound of the range of acc cer body prod scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acc cer body prod scopes
	 */
	public java.util.List<AccCerBodyProdScope> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyProdScope>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acc cer body prod scopes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyProdScopeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc cer body prod scopes
	 * @param end the upper bound of the range of acc cer body prod scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acc cer body prod scopes
	 */
	public java.util.List<AccCerBodyProdScope> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccCerBodyProdScope>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acc cer body prod scopes from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acc cer body prod scopes.
	 *
	 * @return the number of acc cer body prod scopes
	 */
	public int countAll();

}