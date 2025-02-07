/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.stages.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.explosives.competency.stages.service.exception.NoSuchExplosiveCommisionDecisionException;
import com.nbp.explosives.competency.stages.service.model.ExplosiveCommisionDecision;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the explosive commision decision service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExplosiveCommisionDecisionUtil
 * @generated
 */
@ProviderType
public interface ExplosiveCommisionDecisionPersistence
	extends BasePersistence<ExplosiveCommisionDecision> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ExplosiveCommisionDecisionUtil} to access the explosive commision decision persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the explosive commision decisions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching explosive commision decisions
	 */
	public java.util.List<ExplosiveCommisionDecision> findByUuid(String uuid);

	/**
	 * Returns a range of all the explosive commision decisions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveCommisionDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of explosive commision decisions
	 * @param end the upper bound of the range of explosive commision decisions (not inclusive)
	 * @return the range of matching explosive commision decisions
	 */
	public java.util.List<ExplosiveCommisionDecision> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the explosive commision decisions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveCommisionDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of explosive commision decisions
	 * @param end the upper bound of the range of explosive commision decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosive commision decisions
	 */
	public java.util.List<ExplosiveCommisionDecision> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveCommisionDecision> orderByComparator);

	/**
	 * Returns an ordered range of all the explosive commision decisions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveCommisionDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of explosive commision decisions
	 * @param end the upper bound of the range of explosive commision decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosive commision decisions
	 */
	public java.util.List<ExplosiveCommisionDecision> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveCommisionDecision> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first explosive commision decision in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive commision decision
	 * @throws NoSuchExplosiveCommisionDecisionException if a matching explosive commision decision could not be found
	 */
	public ExplosiveCommisionDecision findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosiveCommisionDecision> orderByComparator)
		throws NoSuchExplosiveCommisionDecisionException;

	/**
	 * Returns the first explosive commision decision in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive commision decision, or <code>null</code> if a matching explosive commision decision could not be found
	 */
	public ExplosiveCommisionDecision fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveCommisionDecision> orderByComparator);

	/**
	 * Returns the last explosive commision decision in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive commision decision
	 * @throws NoSuchExplosiveCommisionDecisionException if a matching explosive commision decision could not be found
	 */
	public ExplosiveCommisionDecision findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosiveCommisionDecision> orderByComparator)
		throws NoSuchExplosiveCommisionDecisionException;

	/**
	 * Returns the last explosive commision decision in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive commision decision, or <code>null</code> if a matching explosive commision decision could not be found
	 */
	public ExplosiveCommisionDecision fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveCommisionDecision> orderByComparator);

	/**
	 * Returns the explosive commision decisions before and after the current explosive commision decision in the ordered set where uuid = &#63;.
	 *
	 * @param commisiondecId the primary key of the current explosive commision decision
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosive commision decision
	 * @throws NoSuchExplosiveCommisionDecisionException if a explosive commision decision with the primary key could not be found
	 */
	public ExplosiveCommisionDecision[] findByUuid_PrevAndNext(
			long commisiondecId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosiveCommisionDecision> orderByComparator)
		throws NoSuchExplosiveCommisionDecisionException;

	/**
	 * Removes all the explosive commision decisions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of explosive commision decisions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching explosive commision decisions
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the explosive commision decision where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchExplosiveCommisionDecisionException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching explosive commision decision
	 * @throws NoSuchExplosiveCommisionDecisionException if a matching explosive commision decision could not be found
	 */
	public ExplosiveCommisionDecision findByUUID_G(String uuid, long groupId)
		throws NoSuchExplosiveCommisionDecisionException;

	/**
	 * Returns the explosive commision decision where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching explosive commision decision, or <code>null</code> if a matching explosive commision decision could not be found
	 */
	public ExplosiveCommisionDecision fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the explosive commision decision where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosive commision decision, or <code>null</code> if a matching explosive commision decision could not be found
	 */
	public ExplosiveCommisionDecision fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the explosive commision decision where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the explosive commision decision that was removed
	 */
	public ExplosiveCommisionDecision removeByUUID_G(String uuid, long groupId)
		throws NoSuchExplosiveCommisionDecisionException;

	/**
	 * Returns the number of explosive commision decisions where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching explosive commision decisions
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the explosive commision decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching explosive commision decisions
	 */
	public java.util.List<ExplosiveCommisionDecision> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the explosive commision decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveCommisionDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of explosive commision decisions
	 * @param end the upper bound of the range of explosive commision decisions (not inclusive)
	 * @return the range of matching explosive commision decisions
	 */
	public java.util.List<ExplosiveCommisionDecision> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the explosive commision decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveCommisionDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of explosive commision decisions
	 * @param end the upper bound of the range of explosive commision decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosive commision decisions
	 */
	public java.util.List<ExplosiveCommisionDecision> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveCommisionDecision> orderByComparator);

	/**
	 * Returns an ordered range of all the explosive commision decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveCommisionDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of explosive commision decisions
	 * @param end the upper bound of the range of explosive commision decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosive commision decisions
	 */
	public java.util.List<ExplosiveCommisionDecision> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveCommisionDecision> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first explosive commision decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive commision decision
	 * @throws NoSuchExplosiveCommisionDecisionException if a matching explosive commision decision could not be found
	 */
	public ExplosiveCommisionDecision findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosiveCommisionDecision> orderByComparator)
		throws NoSuchExplosiveCommisionDecisionException;

	/**
	 * Returns the first explosive commision decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive commision decision, or <code>null</code> if a matching explosive commision decision could not be found
	 */
	public ExplosiveCommisionDecision fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveCommisionDecision> orderByComparator);

	/**
	 * Returns the last explosive commision decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive commision decision
	 * @throws NoSuchExplosiveCommisionDecisionException if a matching explosive commision decision could not be found
	 */
	public ExplosiveCommisionDecision findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosiveCommisionDecision> orderByComparator)
		throws NoSuchExplosiveCommisionDecisionException;

	/**
	 * Returns the last explosive commision decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive commision decision, or <code>null</code> if a matching explosive commision decision could not be found
	 */
	public ExplosiveCommisionDecision fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveCommisionDecision> orderByComparator);

	/**
	 * Returns the explosive commision decisions before and after the current explosive commision decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param commisiondecId the primary key of the current explosive commision decision
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosive commision decision
	 * @throws NoSuchExplosiveCommisionDecisionException if a explosive commision decision with the primary key could not be found
	 */
	public ExplosiveCommisionDecision[] findByUuid_C_PrevAndNext(
			long commisiondecId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosiveCommisionDecision> orderByComparator)
		throws NoSuchExplosiveCommisionDecisionException;

	/**
	 * Removes all the explosive commision decisions where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of explosive commision decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching explosive commision decisions
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the explosive commision decision where caseId = &#63; or throws a <code>NoSuchExplosiveCommisionDecisionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching explosive commision decision
	 * @throws NoSuchExplosiveCommisionDecisionException if a matching explosive commision decision could not be found
	 */
	public ExplosiveCommisionDecision findBygetEXP_CD_CI(String caseId)
		throws NoSuchExplosiveCommisionDecisionException;

	/**
	 * Returns the explosive commision decision where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching explosive commision decision, or <code>null</code> if a matching explosive commision decision could not be found
	 */
	public ExplosiveCommisionDecision fetchBygetEXP_CD_CI(String caseId);

	/**
	 * Returns the explosive commision decision where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosive commision decision, or <code>null</code> if a matching explosive commision decision could not be found
	 */
	public ExplosiveCommisionDecision fetchBygetEXP_CD_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the explosive commision decision where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the explosive commision decision that was removed
	 */
	public ExplosiveCommisionDecision removeBygetEXP_CD_CI(String caseId)
		throws NoSuchExplosiveCommisionDecisionException;

	/**
	 * Returns the number of explosive commision decisions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching explosive commision decisions
	 */
	public int countBygetEXP_CD_CI(String caseId);

	/**
	 * Caches the explosive commision decision in the entity cache if it is enabled.
	 *
	 * @param explosiveCommisionDecision the explosive commision decision
	 */
	public void cacheResult(
		ExplosiveCommisionDecision explosiveCommisionDecision);

	/**
	 * Caches the explosive commision decisions in the entity cache if it is enabled.
	 *
	 * @param explosiveCommisionDecisions the explosive commision decisions
	 */
	public void cacheResult(
		java.util.List<ExplosiveCommisionDecision> explosiveCommisionDecisions);

	/**
	 * Creates a new explosive commision decision with the primary key. Does not add the explosive commision decision to the database.
	 *
	 * @param commisiondecId the primary key for the new explosive commision decision
	 * @return the new explosive commision decision
	 */
	public ExplosiveCommisionDecision create(long commisiondecId);

	/**
	 * Removes the explosive commision decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param commisiondecId the primary key of the explosive commision decision
	 * @return the explosive commision decision that was removed
	 * @throws NoSuchExplosiveCommisionDecisionException if a explosive commision decision with the primary key could not be found
	 */
	public ExplosiveCommisionDecision remove(long commisiondecId)
		throws NoSuchExplosiveCommisionDecisionException;

	public ExplosiveCommisionDecision updateImpl(
		ExplosiveCommisionDecision explosiveCommisionDecision);

	/**
	 * Returns the explosive commision decision with the primary key or throws a <code>NoSuchExplosiveCommisionDecisionException</code> if it could not be found.
	 *
	 * @param commisiondecId the primary key of the explosive commision decision
	 * @return the explosive commision decision
	 * @throws NoSuchExplosiveCommisionDecisionException if a explosive commision decision with the primary key could not be found
	 */
	public ExplosiveCommisionDecision findByPrimaryKey(long commisiondecId)
		throws NoSuchExplosiveCommisionDecisionException;

	/**
	 * Returns the explosive commision decision with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param commisiondecId the primary key of the explosive commision decision
	 * @return the explosive commision decision, or <code>null</code> if a explosive commision decision with the primary key could not be found
	 */
	public ExplosiveCommisionDecision fetchByPrimaryKey(long commisiondecId);

	/**
	 * Returns all the explosive commision decisions.
	 *
	 * @return the explosive commision decisions
	 */
	public java.util.List<ExplosiveCommisionDecision> findAll();

	/**
	 * Returns a range of all the explosive commision decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveCommisionDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive commision decisions
	 * @param end the upper bound of the range of explosive commision decisions (not inclusive)
	 * @return the range of explosive commision decisions
	 */
	public java.util.List<ExplosiveCommisionDecision> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the explosive commision decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveCommisionDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive commision decisions
	 * @param end the upper bound of the range of explosive commision decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of explosive commision decisions
	 */
	public java.util.List<ExplosiveCommisionDecision> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveCommisionDecision> orderByComparator);

	/**
	 * Returns an ordered range of all the explosive commision decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveCommisionDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive commision decisions
	 * @param end the upper bound of the range of explosive commision decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of explosive commision decisions
	 */
	public java.util.List<ExplosiveCommisionDecision> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveCommisionDecision> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the explosive commision decisions from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of explosive commision decisions.
	 *
	 * @return the number of explosive commision decisions
	 */
	public int countAll();

}