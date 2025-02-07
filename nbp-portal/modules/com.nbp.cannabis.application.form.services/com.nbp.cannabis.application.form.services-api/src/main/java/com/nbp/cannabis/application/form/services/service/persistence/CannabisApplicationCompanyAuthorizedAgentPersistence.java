/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.cannabis.application.form.services.exception.NoSuchCannabisApplicationCompanyAuthorizedAgentException;
import com.nbp.cannabis.application.form.services.model.CannabisApplicationCompanyAuthorizedAgent;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the cannabis application company authorized agent service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationCompanyAuthorizedAgentUtil
 * @generated
 */
@ProviderType
public interface CannabisApplicationCompanyAuthorizedAgentPersistence
	extends BasePersistence<CannabisApplicationCompanyAuthorizedAgent> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CannabisApplicationCompanyAuthorizedAgentUtil} to access the cannabis application company authorized agent persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the cannabis application company authorized agents where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching cannabis application company authorized agents
	 */
	public java.util.List<CannabisApplicationCompanyAuthorizedAgent> findByUuid(
		String uuid);

	/**
	 * Returns a range of all the cannabis application company authorized agents where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAuthorizedAgentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis application company authorized agents
	 * @param end the upper bound of the range of cannabis application company authorized agents (not inclusive)
	 * @return the range of matching cannabis application company authorized agents
	 */
	public java.util.List<CannabisApplicationCompanyAuthorizedAgent> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis application company authorized agents where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAuthorizedAgentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis application company authorized agents
	 * @param end the upper bound of the range of cannabis application company authorized agents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application company authorized agents
	 */
	public java.util.List<CannabisApplicationCompanyAuthorizedAgent> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationCompanyAuthorizedAgent> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis application company authorized agents where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAuthorizedAgentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis application company authorized agents
	 * @param end the upper bound of the range of cannabis application company authorized agents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application company authorized agents
	 */
	public java.util.List<CannabisApplicationCompanyAuthorizedAgent> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationCompanyAuthorizedAgent> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cannabis application company authorized agent in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application company authorized agent
	 * @throws NoSuchCannabisApplicationCompanyAuthorizedAgentException if a matching cannabis application company authorized agent could not be found
	 */
	public CannabisApplicationCompanyAuthorizedAgent findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationCompanyAuthorizedAgent> orderByComparator)
		throws NoSuchCannabisApplicationCompanyAuthorizedAgentException;

	/**
	 * Returns the first cannabis application company authorized agent in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application company authorized agent, or <code>null</code> if a matching cannabis application company authorized agent could not be found
	 */
	public CannabisApplicationCompanyAuthorizedAgent fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationCompanyAuthorizedAgent> orderByComparator);

	/**
	 * Returns the last cannabis application company authorized agent in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application company authorized agent
	 * @throws NoSuchCannabisApplicationCompanyAuthorizedAgentException if a matching cannabis application company authorized agent could not be found
	 */
	public CannabisApplicationCompanyAuthorizedAgent findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationCompanyAuthorizedAgent> orderByComparator)
		throws NoSuchCannabisApplicationCompanyAuthorizedAgentException;

	/**
	 * Returns the last cannabis application company authorized agent in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application company authorized agent, or <code>null</code> if a matching cannabis application company authorized agent could not be found
	 */
	public CannabisApplicationCompanyAuthorizedAgent fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationCompanyAuthorizedAgent> orderByComparator);

	/**
	 * Returns the cannabis application company authorized agents before and after the current cannabis application company authorized agent in the ordered set where uuid = &#63;.
	 *
	 * @param cannabisCOAId the primary key of the current cannabis application company authorized agent
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application company authorized agent
	 * @throws NoSuchCannabisApplicationCompanyAuthorizedAgentException if a cannabis application company authorized agent with the primary key could not be found
	 */
	public CannabisApplicationCompanyAuthorizedAgent[] findByUuid_PrevAndNext(
			long cannabisCOAId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationCompanyAuthorizedAgent> orderByComparator)
		throws NoSuchCannabisApplicationCompanyAuthorizedAgentException;

	/**
	 * Removes all the cannabis application company authorized agents where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of cannabis application company authorized agents where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching cannabis application company authorized agents
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the cannabis application company authorized agent where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCannabisApplicationCompanyAuthorizedAgentException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis application company authorized agent
	 * @throws NoSuchCannabisApplicationCompanyAuthorizedAgentException if a matching cannabis application company authorized agent could not be found
	 */
	public CannabisApplicationCompanyAuthorizedAgent findByUUID_G(
			String uuid, long groupId)
		throws NoSuchCannabisApplicationCompanyAuthorizedAgentException;

	/**
	 * Returns the cannabis application company authorized agent where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis application company authorized agent, or <code>null</code> if a matching cannabis application company authorized agent could not be found
	 */
	public CannabisApplicationCompanyAuthorizedAgent fetchByUUID_G(
		String uuid, long groupId);

	/**
	 * Returns the cannabis application company authorized agent where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application company authorized agent, or <code>null</code> if a matching cannabis application company authorized agent could not be found
	 */
	public CannabisApplicationCompanyAuthorizedAgent fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the cannabis application company authorized agent where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the cannabis application company authorized agent that was removed
	 */
	public CannabisApplicationCompanyAuthorizedAgent removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchCannabisApplicationCompanyAuthorizedAgentException;

	/**
	 * Returns the number of cannabis application company authorized agents where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching cannabis application company authorized agents
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the cannabis application company authorized agents where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching cannabis application company authorized agents
	 */
	public java.util.List<CannabisApplicationCompanyAuthorizedAgent>
		findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the cannabis application company authorized agents where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAuthorizedAgentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis application company authorized agents
	 * @param end the upper bound of the range of cannabis application company authorized agents (not inclusive)
	 * @return the range of matching cannabis application company authorized agents
	 */
	public java.util.List<CannabisApplicationCompanyAuthorizedAgent>
		findByUuid_C(String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis application company authorized agents where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAuthorizedAgentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis application company authorized agents
	 * @param end the upper bound of the range of cannabis application company authorized agents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application company authorized agents
	 */
	public java.util.List<CannabisApplicationCompanyAuthorizedAgent>
		findByUuid_C(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationCompanyAuthorizedAgent> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis application company authorized agents where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAuthorizedAgentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis application company authorized agents
	 * @param end the upper bound of the range of cannabis application company authorized agents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application company authorized agents
	 */
	public java.util.List<CannabisApplicationCompanyAuthorizedAgent>
		findByUuid_C(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationCompanyAuthorizedAgent> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first cannabis application company authorized agent in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application company authorized agent
	 * @throws NoSuchCannabisApplicationCompanyAuthorizedAgentException if a matching cannabis application company authorized agent could not be found
	 */
	public CannabisApplicationCompanyAuthorizedAgent findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationCompanyAuthorizedAgent> orderByComparator)
		throws NoSuchCannabisApplicationCompanyAuthorizedAgentException;

	/**
	 * Returns the first cannabis application company authorized agent in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application company authorized agent, or <code>null</code> if a matching cannabis application company authorized agent could not be found
	 */
	public CannabisApplicationCompanyAuthorizedAgent fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationCompanyAuthorizedAgent> orderByComparator);

	/**
	 * Returns the last cannabis application company authorized agent in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application company authorized agent
	 * @throws NoSuchCannabisApplicationCompanyAuthorizedAgentException if a matching cannabis application company authorized agent could not be found
	 */
	public CannabisApplicationCompanyAuthorizedAgent findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationCompanyAuthorizedAgent> orderByComparator)
		throws NoSuchCannabisApplicationCompanyAuthorizedAgentException;

	/**
	 * Returns the last cannabis application company authorized agent in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application company authorized agent, or <code>null</code> if a matching cannabis application company authorized agent could not be found
	 */
	public CannabisApplicationCompanyAuthorizedAgent fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationCompanyAuthorizedAgent> orderByComparator);

	/**
	 * Returns the cannabis application company authorized agents before and after the current cannabis application company authorized agent in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param cannabisCOAId the primary key of the current cannabis application company authorized agent
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application company authorized agent
	 * @throws NoSuchCannabisApplicationCompanyAuthorizedAgentException if a cannabis application company authorized agent with the primary key could not be found
	 */
	public CannabisApplicationCompanyAuthorizedAgent[] findByUuid_C_PrevAndNext(
			long cannabisCOAId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationCompanyAuthorizedAgent> orderByComparator)
		throws NoSuchCannabisApplicationCompanyAuthorizedAgentException;

	/**
	 * Removes all the cannabis application company authorized agents where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of cannabis application company authorized agents where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching cannabis application company authorized agents
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the cannabis application company authorized agent where cannabisApplicationId = &#63; or throws a <code>NoSuchCannabisApplicationCompanyAuthorizedAgentException</code> if it could not be found.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis application company authorized agent
	 * @throws NoSuchCannabisApplicationCompanyAuthorizedAgentException if a matching cannabis application company authorized agent could not be found
	 */
	public CannabisApplicationCompanyAuthorizedAgent findBygetCAA_by_CAI(
			long cannabisApplicationId)
		throws NoSuchCannabisApplicationCompanyAuthorizedAgentException;

	/**
	 * Returns the cannabis application company authorized agent where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis application company authorized agent, or <code>null</code> if a matching cannabis application company authorized agent could not be found
	 */
	public CannabisApplicationCompanyAuthorizedAgent fetchBygetCAA_by_CAI(
		long cannabisApplicationId);

	/**
	 * Returns the cannabis application company authorized agent where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application company authorized agent, or <code>null</code> if a matching cannabis application company authorized agent could not be found
	 */
	public CannabisApplicationCompanyAuthorizedAgent fetchBygetCAA_by_CAI(
		long cannabisApplicationId, boolean useFinderCache);

	/**
	 * Removes the cannabis application company authorized agent where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the cannabis application company authorized agent that was removed
	 */
	public CannabisApplicationCompanyAuthorizedAgent removeBygetCAA_by_CAI(
			long cannabisApplicationId)
		throws NoSuchCannabisApplicationCompanyAuthorizedAgentException;

	/**
	 * Returns the number of cannabis application company authorized agents where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis application company authorized agents
	 */
	public int countBygetCAA_by_CAI(long cannabisApplicationId);

	/**
	 * Caches the cannabis application company authorized agent in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationCompanyAuthorizedAgent the cannabis application company authorized agent
	 */
	public void cacheResult(
		CannabisApplicationCompanyAuthorizedAgent
			cannabisApplicationCompanyAuthorizedAgent);

	/**
	 * Caches the cannabis application company authorized agents in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationCompanyAuthorizedAgents the cannabis application company authorized agents
	 */
	public void cacheResult(
		java.util.List<CannabisApplicationCompanyAuthorizedAgent>
			cannabisApplicationCompanyAuthorizedAgents);

	/**
	 * Creates a new cannabis application company authorized agent with the primary key. Does not add the cannabis application company authorized agent to the database.
	 *
	 * @param cannabisCOAId the primary key for the new cannabis application company authorized agent
	 * @return the new cannabis application company authorized agent
	 */
	public CannabisApplicationCompanyAuthorizedAgent create(long cannabisCOAId);

	/**
	 * Removes the cannabis application company authorized agent with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisCOAId the primary key of the cannabis application company authorized agent
	 * @return the cannabis application company authorized agent that was removed
	 * @throws NoSuchCannabisApplicationCompanyAuthorizedAgentException if a cannabis application company authorized agent with the primary key could not be found
	 */
	public CannabisApplicationCompanyAuthorizedAgent remove(long cannabisCOAId)
		throws NoSuchCannabisApplicationCompanyAuthorizedAgentException;

	public CannabisApplicationCompanyAuthorizedAgent updateImpl(
		CannabisApplicationCompanyAuthorizedAgent
			cannabisApplicationCompanyAuthorizedAgent);

	/**
	 * Returns the cannabis application company authorized agent with the primary key or throws a <code>NoSuchCannabisApplicationCompanyAuthorizedAgentException</code> if it could not be found.
	 *
	 * @param cannabisCOAId the primary key of the cannabis application company authorized agent
	 * @return the cannabis application company authorized agent
	 * @throws NoSuchCannabisApplicationCompanyAuthorizedAgentException if a cannabis application company authorized agent with the primary key could not be found
	 */
	public CannabisApplicationCompanyAuthorizedAgent findByPrimaryKey(
			long cannabisCOAId)
		throws NoSuchCannabisApplicationCompanyAuthorizedAgentException;

	/**
	 * Returns the cannabis application company authorized agent with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisCOAId the primary key of the cannabis application company authorized agent
	 * @return the cannabis application company authorized agent, or <code>null</code> if a cannabis application company authorized agent with the primary key could not be found
	 */
	public CannabisApplicationCompanyAuthorizedAgent fetchByPrimaryKey(
		long cannabisCOAId);

	/**
	 * Returns all the cannabis application company authorized agents.
	 *
	 * @return the cannabis application company authorized agents
	 */
	public java.util.List<CannabisApplicationCompanyAuthorizedAgent> findAll();

	/**
	 * Returns a range of all the cannabis application company authorized agents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAuthorizedAgentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application company authorized agents
	 * @param end the upper bound of the range of cannabis application company authorized agents (not inclusive)
	 * @return the range of cannabis application company authorized agents
	 */
	public java.util.List<CannabisApplicationCompanyAuthorizedAgent> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the cannabis application company authorized agents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAuthorizedAgentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application company authorized agents
	 * @param end the upper bound of the range of cannabis application company authorized agents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis application company authorized agents
	 */
	public java.util.List<CannabisApplicationCompanyAuthorizedAgent> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationCompanyAuthorizedAgent> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis application company authorized agents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAuthorizedAgentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application company authorized agents
	 * @param end the upper bound of the range of cannabis application company authorized agents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis application company authorized agents
	 */
	public java.util.List<CannabisApplicationCompanyAuthorizedAgent> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationCompanyAuthorizedAgent> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the cannabis application company authorized agents from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of cannabis application company authorized agents.
	 *
	 * @return the number of cannabis application company authorized agents
	 */
	public int countAll();

}