/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quarry.stage.service.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.quarry.stage.service.exception.NoSuchQuarryAppCommitteeDecisionException;
import com.nbp.quarry.stage.service.model.QuarryAppCommitteeDecision;
import com.nbp.quarry.stage.service.model.QuarryAppCommitteeDecisionTable;
import com.nbp.quarry.stage.service.model.impl.QuarryAppCommitteeDecisionImpl;
import com.nbp.quarry.stage.service.model.impl.QuarryAppCommitteeDecisionModelImpl;
import com.nbp.quarry.stage.service.service.persistence.QuarryAppCommitteeDecisionPersistence;
import com.nbp.quarry.stage.service.service.persistence.QuarryAppCommitteeDecisionUtil;
import com.nbp.quarry.stage.service.service.persistence.impl.constants.QUARRY_STAGEPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the quarry app committee decision service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = QuarryAppCommitteeDecisionPersistence.class)
public class QuarryAppCommitteeDecisionPersistenceImpl
	extends BasePersistenceImpl<QuarryAppCommitteeDecision>
	implements QuarryAppCommitteeDecisionPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>QuarryAppCommitteeDecisionUtil</code> to access the quarry app committee decision persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		QuarryAppCommitteeDecisionImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetQuarry_CD_CI;
	private FinderPath _finderPathCountBygetQuarry_CD_CI;

	/**
	 * Returns the quarry app committee decision where caseId = &#63; or throws a <code>NoSuchQuarryAppCommitteeDecisionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching quarry app committee decision
	 * @throws NoSuchQuarryAppCommitteeDecisionException if a matching quarry app committee decision could not be found
	 */
	@Override
	public QuarryAppCommitteeDecision findBygetQuarry_CD_CI(String caseId)
		throws NoSuchQuarryAppCommitteeDecisionException {

		QuarryAppCommitteeDecision quarryAppCommitteeDecision =
			fetchBygetQuarry_CD_CI(caseId);

		if (quarryAppCommitteeDecision == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchQuarryAppCommitteeDecisionException(sb.toString());
		}

		return quarryAppCommitteeDecision;
	}

	/**
	 * Returns the quarry app committee decision where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching quarry app committee decision, or <code>null</code> if a matching quarry app committee decision could not be found
	 */
	@Override
	public QuarryAppCommitteeDecision fetchBygetQuarry_CD_CI(String caseId) {
		return fetchBygetQuarry_CD_CI(caseId, true);
	}

	/**
	 * Returns the quarry app committee decision where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry app committee decision, or <code>null</code> if a matching quarry app committee decision could not be found
	 */
	@Override
	public QuarryAppCommitteeDecision fetchBygetQuarry_CD_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetQuarry_CD_CI, finderArgs, this);
		}

		if (result instanceof QuarryAppCommitteeDecision) {
			QuarryAppCommitteeDecision quarryAppCommitteeDecision =
				(QuarryAppCommitteeDecision)result;

			if (!Objects.equals(
					caseId, quarryAppCommitteeDecision.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_QUARRYAPPCOMMITTEEDECISION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETQUARRY_CD_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETQUARRY_CD_CI_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				List<QuarryAppCommitteeDecision> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetQuarry_CD_CI, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {caseId};
							}

							_log.warn(
								"QuarryAppCommitteeDecisionPersistenceImpl.fetchBygetQuarry_CD_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					QuarryAppCommitteeDecision quarryAppCommitteeDecision =
						list.get(0);

					result = quarryAppCommitteeDecision;

					cacheResult(quarryAppCommitteeDecision);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (QuarryAppCommitteeDecision)result;
		}
	}

	/**
	 * Removes the quarry app committee decision where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the quarry app committee decision that was removed
	 */
	@Override
	public QuarryAppCommitteeDecision removeBygetQuarry_CD_CI(String caseId)
		throws NoSuchQuarryAppCommitteeDecisionException {

		QuarryAppCommitteeDecision quarryAppCommitteeDecision =
			findBygetQuarry_CD_CI(caseId);

		return remove(quarryAppCommitteeDecision);
	}

	/**
	 * Returns the number of quarry app committee decisions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching quarry app committee decisions
	 */
	@Override
	public int countBygetQuarry_CD_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetQuarry_CD_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUARRYAPPCOMMITTEEDECISION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETQUARRY_CD_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETQUARRY_CD_CI_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GETQUARRY_CD_CI_CASEID_2 =
		"quarryAppCommitteeDecision.caseId = ?";

	private static final String _FINDER_COLUMN_GETQUARRY_CD_CI_CASEID_3 =
		"(quarryAppCommitteeDecision.caseId IS NULL OR quarryAppCommitteeDecision.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetQuarry_By_CD;
	private FinderPath _finderPathWithoutPaginationFindBygetQuarry_By_CD;
	private FinderPath _finderPathCountBygetQuarry_By_CD;

	/**
	 * Returns all the quarry app committee decisions where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @return the matching quarry app committee decisions
	 */
	@Override
	public List<QuarryAppCommitteeDecision> findBygetQuarry_By_CD(
		String committeeDecision) {

		return findBygetQuarry_By_CD(
			committeeDecision, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the quarry app committee decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryAppCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of quarry app committee decisions
	 * @param end the upper bound of the range of quarry app committee decisions (not inclusive)
	 * @return the range of matching quarry app committee decisions
	 */
	@Override
	public List<QuarryAppCommitteeDecision> findBygetQuarry_By_CD(
		String committeeDecision, int start, int end) {

		return findBygetQuarry_By_CD(committeeDecision, start, end, null);
	}

	/**
	 * Returns an ordered range of all the quarry app committee decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryAppCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of quarry app committee decisions
	 * @param end the upper bound of the range of quarry app committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry app committee decisions
	 */
	@Override
	public List<QuarryAppCommitteeDecision> findBygetQuarry_By_CD(
		String committeeDecision, int start, int end,
		OrderByComparator<QuarryAppCommitteeDecision> orderByComparator) {

		return findBygetQuarry_By_CD(
			committeeDecision, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the quarry app committee decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryAppCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of quarry app committee decisions
	 * @param end the upper bound of the range of quarry app committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry app committee decisions
	 */
	@Override
	public List<QuarryAppCommitteeDecision> findBygetQuarry_By_CD(
		String committeeDecision, int start, int end,
		OrderByComparator<QuarryAppCommitteeDecision> orderByComparator,
		boolean useFinderCache) {

		committeeDecision = Objects.toString(committeeDecision, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetQuarry_By_CD;
				finderArgs = new Object[] {committeeDecision};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetQuarry_By_CD;
			finderArgs = new Object[] {
				committeeDecision, start, end, orderByComparator
			};
		}

		List<QuarryAppCommitteeDecision> list = null;

		if (useFinderCache) {
			list = (List<QuarryAppCommitteeDecision>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (QuarryAppCommitteeDecision quarryAppCommitteeDecision :
						list) {

					if (!committeeDecision.equals(
							quarryAppCommitteeDecision.
								getCommitteeDecision())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_QUARRYAPPCOMMITTEEDECISION_WHERE);

			boolean bindCommitteeDecision = false;

			if (committeeDecision.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETQUARRY_BY_CD_COMMITTEEDECISION_3);
			}
			else {
				bindCommitteeDecision = true;

				sb.append(_FINDER_COLUMN_GETQUARRY_BY_CD_COMMITTEEDECISION_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(QuarryAppCommitteeDecisionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCommitteeDecision) {
					queryPos.add(committeeDecision);
				}

				list = (List<QuarryAppCommitteeDecision>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first quarry app committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry app committee decision
	 * @throws NoSuchQuarryAppCommitteeDecisionException if a matching quarry app committee decision could not be found
	 */
	@Override
	public QuarryAppCommitteeDecision findBygetQuarry_By_CD_First(
			String committeeDecision,
			OrderByComparator<QuarryAppCommitteeDecision> orderByComparator)
		throws NoSuchQuarryAppCommitteeDecisionException {

		QuarryAppCommitteeDecision quarryAppCommitteeDecision =
			fetchBygetQuarry_By_CD_First(committeeDecision, orderByComparator);

		if (quarryAppCommitteeDecision != null) {
			return quarryAppCommitteeDecision;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("committeeDecision=");
		sb.append(committeeDecision);

		sb.append("}");

		throw new NoSuchQuarryAppCommitteeDecisionException(sb.toString());
	}

	/**
	 * Returns the first quarry app committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry app committee decision, or <code>null</code> if a matching quarry app committee decision could not be found
	 */
	@Override
	public QuarryAppCommitteeDecision fetchBygetQuarry_By_CD_First(
		String committeeDecision,
		OrderByComparator<QuarryAppCommitteeDecision> orderByComparator) {

		List<QuarryAppCommitteeDecision> list = findBygetQuarry_By_CD(
			committeeDecision, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last quarry app committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry app committee decision
	 * @throws NoSuchQuarryAppCommitteeDecisionException if a matching quarry app committee decision could not be found
	 */
	@Override
	public QuarryAppCommitteeDecision findBygetQuarry_By_CD_Last(
			String committeeDecision,
			OrderByComparator<QuarryAppCommitteeDecision> orderByComparator)
		throws NoSuchQuarryAppCommitteeDecisionException {

		QuarryAppCommitteeDecision quarryAppCommitteeDecision =
			fetchBygetQuarry_By_CD_Last(committeeDecision, orderByComparator);

		if (quarryAppCommitteeDecision != null) {
			return quarryAppCommitteeDecision;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("committeeDecision=");
		sb.append(committeeDecision);

		sb.append("}");

		throw new NoSuchQuarryAppCommitteeDecisionException(sb.toString());
	}

	/**
	 * Returns the last quarry app committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry app committee decision, or <code>null</code> if a matching quarry app committee decision could not be found
	 */
	@Override
	public QuarryAppCommitteeDecision fetchBygetQuarry_By_CD_Last(
		String committeeDecision,
		OrderByComparator<QuarryAppCommitteeDecision> orderByComparator) {

		int count = countBygetQuarry_By_CD(committeeDecision);

		if (count == 0) {
			return null;
		}

		List<QuarryAppCommitteeDecision> list = findBygetQuarry_By_CD(
			committeeDecision, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the quarry app committee decisions before and after the current quarry app committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param quarryAppCommitteeDecisionId the primary key of the current quarry app committee decision
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry app committee decision
	 * @throws NoSuchQuarryAppCommitteeDecisionException if a quarry app committee decision with the primary key could not be found
	 */
	@Override
	public QuarryAppCommitteeDecision[] findBygetQuarry_By_CD_PrevAndNext(
			long quarryAppCommitteeDecisionId, String committeeDecision,
			OrderByComparator<QuarryAppCommitteeDecision> orderByComparator)
		throws NoSuchQuarryAppCommitteeDecisionException {

		committeeDecision = Objects.toString(committeeDecision, "");

		QuarryAppCommitteeDecision quarryAppCommitteeDecision =
			findByPrimaryKey(quarryAppCommitteeDecisionId);

		Session session = null;

		try {
			session = openSession();

			QuarryAppCommitteeDecision[] array =
				new QuarryAppCommitteeDecisionImpl[3];

			array[0] = getBygetQuarry_By_CD_PrevAndNext(
				session, quarryAppCommitteeDecision, committeeDecision,
				orderByComparator, true);

			array[1] = quarryAppCommitteeDecision;

			array[2] = getBygetQuarry_By_CD_PrevAndNext(
				session, quarryAppCommitteeDecision, committeeDecision,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected QuarryAppCommitteeDecision getBygetQuarry_By_CD_PrevAndNext(
		Session session, QuarryAppCommitteeDecision quarryAppCommitteeDecision,
		String committeeDecision,
		OrderByComparator<QuarryAppCommitteeDecision> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_QUARRYAPPCOMMITTEEDECISION_WHERE);

		boolean bindCommitteeDecision = false;

		if (committeeDecision.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETQUARRY_BY_CD_COMMITTEEDECISION_3);
		}
		else {
			bindCommitteeDecision = true;

			sb.append(_FINDER_COLUMN_GETQUARRY_BY_CD_COMMITTEEDECISION_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(QuarryAppCommitteeDecisionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindCommitteeDecision) {
			queryPos.add(committeeDecision);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						quarryAppCommitteeDecision)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<QuarryAppCommitteeDecision> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the quarry app committee decisions where committeeDecision = &#63; from the database.
	 *
	 * @param committeeDecision the committee decision
	 */
	@Override
	public void removeBygetQuarry_By_CD(String committeeDecision) {
		for (QuarryAppCommitteeDecision quarryAppCommitteeDecision :
				findBygetQuarry_By_CD(
					committeeDecision, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(quarryAppCommitteeDecision);
		}
	}

	/**
	 * Returns the number of quarry app committee decisions where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @return the number of matching quarry app committee decisions
	 */
	@Override
	public int countBygetQuarry_By_CD(String committeeDecision) {
		committeeDecision = Objects.toString(committeeDecision, "");

		FinderPath finderPath = _finderPathCountBygetQuarry_By_CD;

		Object[] finderArgs = new Object[] {committeeDecision};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUARRYAPPCOMMITTEEDECISION_WHERE);

			boolean bindCommitteeDecision = false;

			if (committeeDecision.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETQUARRY_BY_CD_COMMITTEEDECISION_3);
			}
			else {
				bindCommitteeDecision = true;

				sb.append(_FINDER_COLUMN_GETQUARRY_BY_CD_COMMITTEEDECISION_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCommitteeDecision) {
					queryPos.add(committeeDecision);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETQUARRY_BY_CD_COMMITTEEDECISION_2 =
			"quarryAppCommitteeDecision.committeeDecision = ?";

	private static final String
		_FINDER_COLUMN_GETQUARRY_BY_CD_COMMITTEEDECISION_3 =
			"(quarryAppCommitteeDecision.committeeDecision IS NULL OR quarryAppCommitteeDecision.committeeDecision = '')";

	public QuarryAppCommitteeDecisionPersistenceImpl() {
		setModelClass(QuarryAppCommitteeDecision.class);

		setModelImplClass(QuarryAppCommitteeDecisionImpl.class);
		setModelPKClass(long.class);

		setTable(QuarryAppCommitteeDecisionTable.INSTANCE);
	}

	/**
	 * Caches the quarry app committee decision in the entity cache if it is enabled.
	 *
	 * @param quarryAppCommitteeDecision the quarry app committee decision
	 */
	@Override
	public void cacheResult(
		QuarryAppCommitteeDecision quarryAppCommitteeDecision) {

		entityCache.putResult(
			QuarryAppCommitteeDecisionImpl.class,
			quarryAppCommitteeDecision.getPrimaryKey(),
			quarryAppCommitteeDecision);

		finderCache.putResult(
			_finderPathFetchBygetQuarry_CD_CI,
			new Object[] {quarryAppCommitteeDecision.getCaseId()},
			quarryAppCommitteeDecision);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the quarry app committee decisions in the entity cache if it is enabled.
	 *
	 * @param quarryAppCommitteeDecisions the quarry app committee decisions
	 */
	@Override
	public void cacheResult(
		List<QuarryAppCommitteeDecision> quarryAppCommitteeDecisions) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (quarryAppCommitteeDecisions.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (QuarryAppCommitteeDecision quarryAppCommitteeDecision :
				quarryAppCommitteeDecisions) {

			if (entityCache.getResult(
					QuarryAppCommitteeDecisionImpl.class,
					quarryAppCommitteeDecision.getPrimaryKey()) == null) {

				cacheResult(quarryAppCommitteeDecision);
			}
		}
	}

	/**
	 * Clears the cache for all quarry app committee decisions.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(QuarryAppCommitteeDecisionImpl.class);

		finderCache.clearCache(QuarryAppCommitteeDecisionImpl.class);
	}

	/**
	 * Clears the cache for the quarry app committee decision.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		QuarryAppCommitteeDecision quarryAppCommitteeDecision) {

		entityCache.removeResult(
			QuarryAppCommitteeDecisionImpl.class, quarryAppCommitteeDecision);
	}

	@Override
	public void clearCache(
		List<QuarryAppCommitteeDecision> quarryAppCommitteeDecisions) {

		for (QuarryAppCommitteeDecision quarryAppCommitteeDecision :
				quarryAppCommitteeDecisions) {

			entityCache.removeResult(
				QuarryAppCommitteeDecisionImpl.class,
				quarryAppCommitteeDecision);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(QuarryAppCommitteeDecisionImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				QuarryAppCommitteeDecisionImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		QuarryAppCommitteeDecisionModelImpl
			quarryAppCommitteeDecisionModelImpl) {

		Object[] args = new Object[] {
			quarryAppCommitteeDecisionModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetQuarry_CD_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetQuarry_CD_CI, args,
			quarryAppCommitteeDecisionModelImpl);
	}

	/**
	 * Creates a new quarry app committee decision with the primary key. Does not add the quarry app committee decision to the database.
	 *
	 * @param quarryAppCommitteeDecisionId the primary key for the new quarry app committee decision
	 * @return the new quarry app committee decision
	 */
	@Override
	public QuarryAppCommitteeDecision create(
		long quarryAppCommitteeDecisionId) {

		QuarryAppCommitteeDecision quarryAppCommitteeDecision =
			new QuarryAppCommitteeDecisionImpl();

		quarryAppCommitteeDecision.setNew(true);
		quarryAppCommitteeDecision.setPrimaryKey(quarryAppCommitteeDecisionId);

		quarryAppCommitteeDecision.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return quarryAppCommitteeDecision;
	}

	/**
	 * Removes the quarry app committee decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param quarryAppCommitteeDecisionId the primary key of the quarry app committee decision
	 * @return the quarry app committee decision that was removed
	 * @throws NoSuchQuarryAppCommitteeDecisionException if a quarry app committee decision with the primary key could not be found
	 */
	@Override
	public QuarryAppCommitteeDecision remove(long quarryAppCommitteeDecisionId)
		throws NoSuchQuarryAppCommitteeDecisionException {

		return remove((Serializable)quarryAppCommitteeDecisionId);
	}

	/**
	 * Removes the quarry app committee decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the quarry app committee decision
	 * @return the quarry app committee decision that was removed
	 * @throws NoSuchQuarryAppCommitteeDecisionException if a quarry app committee decision with the primary key could not be found
	 */
	@Override
	public QuarryAppCommitteeDecision remove(Serializable primaryKey)
		throws NoSuchQuarryAppCommitteeDecisionException {

		Session session = null;

		try {
			session = openSession();

			QuarryAppCommitteeDecision quarryAppCommitteeDecision =
				(QuarryAppCommitteeDecision)session.get(
					QuarryAppCommitteeDecisionImpl.class, primaryKey);

			if (quarryAppCommitteeDecision == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQuarryAppCommitteeDecisionException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(quarryAppCommitteeDecision);
		}
		catch (NoSuchQuarryAppCommitteeDecisionException
					noSuchEntityException) {

			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected QuarryAppCommitteeDecision removeImpl(
		QuarryAppCommitteeDecision quarryAppCommitteeDecision) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(quarryAppCommitteeDecision)) {
				quarryAppCommitteeDecision =
					(QuarryAppCommitteeDecision)session.get(
						QuarryAppCommitteeDecisionImpl.class,
						quarryAppCommitteeDecision.getPrimaryKeyObj());
			}

			if (quarryAppCommitteeDecision != null) {
				session.delete(quarryAppCommitteeDecision);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (quarryAppCommitteeDecision != null) {
			clearCache(quarryAppCommitteeDecision);
		}

		return quarryAppCommitteeDecision;
	}

	@Override
	public QuarryAppCommitteeDecision updateImpl(
		QuarryAppCommitteeDecision quarryAppCommitteeDecision) {

		boolean isNew = quarryAppCommitteeDecision.isNew();

		if (!(quarryAppCommitteeDecision instanceof
				QuarryAppCommitteeDecisionModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(quarryAppCommitteeDecision.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					quarryAppCommitteeDecision);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in quarryAppCommitteeDecision proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom QuarryAppCommitteeDecision implementation " +
					quarryAppCommitteeDecision.getClass());
		}

		QuarryAppCommitteeDecisionModelImpl
			quarryAppCommitteeDecisionModelImpl =
				(QuarryAppCommitteeDecisionModelImpl)quarryAppCommitteeDecision;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (quarryAppCommitteeDecision.getCreateDate() == null)) {
			if (serviceContext == null) {
				quarryAppCommitteeDecision.setCreateDate(date);
			}
			else {
				quarryAppCommitteeDecision.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!quarryAppCommitteeDecisionModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				quarryAppCommitteeDecision.setModifiedDate(date);
			}
			else {
				quarryAppCommitteeDecision.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(quarryAppCommitteeDecision);
			}
			else {
				quarryAppCommitteeDecision =
					(QuarryAppCommitteeDecision)session.merge(
						quarryAppCommitteeDecision);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			QuarryAppCommitteeDecisionImpl.class,
			quarryAppCommitteeDecisionModelImpl, false, true);

		cacheUniqueFindersCache(quarryAppCommitteeDecisionModelImpl);

		if (isNew) {
			quarryAppCommitteeDecision.setNew(false);
		}

		quarryAppCommitteeDecision.resetOriginalValues();

		return quarryAppCommitteeDecision;
	}

	/**
	 * Returns the quarry app committee decision with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the quarry app committee decision
	 * @return the quarry app committee decision
	 * @throws NoSuchQuarryAppCommitteeDecisionException if a quarry app committee decision with the primary key could not be found
	 */
	@Override
	public QuarryAppCommitteeDecision findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQuarryAppCommitteeDecisionException {

		QuarryAppCommitteeDecision quarryAppCommitteeDecision =
			fetchByPrimaryKey(primaryKey);

		if (quarryAppCommitteeDecision == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQuarryAppCommitteeDecisionException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return quarryAppCommitteeDecision;
	}

	/**
	 * Returns the quarry app committee decision with the primary key or throws a <code>NoSuchQuarryAppCommitteeDecisionException</code> if it could not be found.
	 *
	 * @param quarryAppCommitteeDecisionId the primary key of the quarry app committee decision
	 * @return the quarry app committee decision
	 * @throws NoSuchQuarryAppCommitteeDecisionException if a quarry app committee decision with the primary key could not be found
	 */
	@Override
	public QuarryAppCommitteeDecision findByPrimaryKey(
			long quarryAppCommitteeDecisionId)
		throws NoSuchQuarryAppCommitteeDecisionException {

		return findByPrimaryKey((Serializable)quarryAppCommitteeDecisionId);
	}

	/**
	 * Returns the quarry app committee decision with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param quarryAppCommitteeDecisionId the primary key of the quarry app committee decision
	 * @return the quarry app committee decision, or <code>null</code> if a quarry app committee decision with the primary key could not be found
	 */
	@Override
	public QuarryAppCommitteeDecision fetchByPrimaryKey(
		long quarryAppCommitteeDecisionId) {

		return fetchByPrimaryKey((Serializable)quarryAppCommitteeDecisionId);
	}

	/**
	 * Returns all the quarry app committee decisions.
	 *
	 * @return the quarry app committee decisions
	 */
	@Override
	public List<QuarryAppCommitteeDecision> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the quarry app committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryAppCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry app committee decisions
	 * @param end the upper bound of the range of quarry app committee decisions (not inclusive)
	 * @return the range of quarry app committee decisions
	 */
	@Override
	public List<QuarryAppCommitteeDecision> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the quarry app committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryAppCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry app committee decisions
	 * @param end the upper bound of the range of quarry app committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quarry app committee decisions
	 */
	@Override
	public List<QuarryAppCommitteeDecision> findAll(
		int start, int end,
		OrderByComparator<QuarryAppCommitteeDecision> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the quarry app committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryAppCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry app committee decisions
	 * @param end the upper bound of the range of quarry app committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quarry app committee decisions
	 */
	@Override
	public List<QuarryAppCommitteeDecision> findAll(
		int start, int end,
		OrderByComparator<QuarryAppCommitteeDecision> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<QuarryAppCommitteeDecision> list = null;

		if (useFinderCache) {
			list = (List<QuarryAppCommitteeDecision>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_QUARRYAPPCOMMITTEEDECISION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_QUARRYAPPCOMMITTEEDECISION;

				sql = sql.concat(
					QuarryAppCommitteeDecisionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<QuarryAppCommitteeDecision>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the quarry app committee decisions from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (QuarryAppCommitteeDecision quarryAppCommitteeDecision :
				findAll()) {

			remove(quarryAppCommitteeDecision);
		}
	}

	/**
	 * Returns the number of quarry app committee decisions.
	 *
	 * @return the number of quarry app committee decisions
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_QUARRYAPPCOMMITTEEDECISION);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "quarryAppCommitteeDecisionId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_QUARRYAPPCOMMITTEEDECISION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return QuarryAppCommitteeDecisionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the quarry app committee decision persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathFetchBygetQuarry_CD_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetQuarry_CD_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetQuarry_CD_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetQuarry_CD_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetQuarry_By_CD = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetQuarry_By_CD",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"committeeDecision"}, true);

		_finderPathWithoutPaginationFindBygetQuarry_By_CD = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetQuarry_By_CD",
			new String[] {String.class.getName()},
			new String[] {"committeeDecision"}, true);

		_finderPathCountBygetQuarry_By_CD = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetQuarry_By_CD",
			new String[] {String.class.getName()},
			new String[] {"committeeDecision"}, false);

		QuarryAppCommitteeDecisionUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		QuarryAppCommitteeDecisionUtil.setPersistence(null);

		entityCache.removeCache(QuarryAppCommitteeDecisionImpl.class.getName());
	}

	@Override
	@Reference(
		target = QUARRY_STAGEPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = QUARRY_STAGEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = QUARRY_STAGEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_QUARRYAPPCOMMITTEEDECISION =
		"SELECT quarryAppCommitteeDecision FROM QuarryAppCommitteeDecision quarryAppCommitteeDecision";

	private static final String _SQL_SELECT_QUARRYAPPCOMMITTEEDECISION_WHERE =
		"SELECT quarryAppCommitteeDecision FROM QuarryAppCommitteeDecision quarryAppCommitteeDecision WHERE ";

	private static final String _SQL_COUNT_QUARRYAPPCOMMITTEEDECISION =
		"SELECT COUNT(quarryAppCommitteeDecision) FROM QuarryAppCommitteeDecision quarryAppCommitteeDecision";

	private static final String _SQL_COUNT_QUARRYAPPCOMMITTEEDECISION_WHERE =
		"SELECT COUNT(quarryAppCommitteeDecision) FROM QuarryAppCommitteeDecision quarryAppCommitteeDecision WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"quarryAppCommitteeDecision.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No QuarryAppCommitteeDecision exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No QuarryAppCommitteeDecision exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		QuarryAppCommitteeDecisionPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}