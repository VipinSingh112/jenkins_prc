/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.service.persistence.impl;

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

import com.nbp.ncbj.stages.services.exception.NoSuchNcbjAppBoardDecisionException;
import com.nbp.ncbj.stages.services.model.NcbjAppBoardDecision;
import com.nbp.ncbj.stages.services.model.NcbjAppBoardDecisionTable;
import com.nbp.ncbj.stages.services.model.impl.NcbjAppBoardDecisionImpl;
import com.nbp.ncbj.stages.services.model.impl.NcbjAppBoardDecisionModelImpl;
import com.nbp.ncbj.stages.services.service.persistence.NcbjAppBoardDecisionPersistence;
import com.nbp.ncbj.stages.services.service.persistence.NcbjAppBoardDecisionUtil;
import com.nbp.ncbj.stages.services.service.persistence.impl.constants.NCBJ_STAGESPersistenceConstants;

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
 * The persistence implementation for the ncbj app board decision service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = NcbjAppBoardDecisionPersistence.class)
public class NcbjAppBoardDecisionPersistenceImpl
	extends BasePersistenceImpl<NcbjAppBoardDecision>
	implements NcbjAppBoardDecisionPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>NcbjAppBoardDecisionUtil</code> to access the ncbj app board decision persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		NcbjAppBoardDecisionImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetNcbj_CD_CI;
	private FinderPath _finderPathCountBygetNcbj_CD_CI;

	/**
	 * Returns the ncbj app board decision where caseId = &#63; or throws a <code>NoSuchNcbjAppBoardDecisionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj app board decision
	 * @throws NoSuchNcbjAppBoardDecisionException if a matching ncbj app board decision could not be found
	 */
	@Override
	public NcbjAppBoardDecision findBygetNcbj_CD_CI(String caseId)
		throws NoSuchNcbjAppBoardDecisionException {

		NcbjAppBoardDecision ncbjAppBoardDecision = fetchBygetNcbj_CD_CI(
			caseId);

		if (ncbjAppBoardDecision == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchNcbjAppBoardDecisionException(sb.toString());
		}

		return ncbjAppBoardDecision;
	}

	/**
	 * Returns the ncbj app board decision where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj app board decision, or <code>null</code> if a matching ncbj app board decision could not be found
	 */
	@Override
	public NcbjAppBoardDecision fetchBygetNcbj_CD_CI(String caseId) {
		return fetchBygetNcbj_CD_CI(caseId, true);
	}

	/**
	 * Returns the ncbj app board decision where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj app board decision, or <code>null</code> if a matching ncbj app board decision could not be found
	 */
	@Override
	public NcbjAppBoardDecision fetchBygetNcbj_CD_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetNcbj_CD_CI, finderArgs, this);
		}

		if (result instanceof NcbjAppBoardDecision) {
			NcbjAppBoardDecision ncbjAppBoardDecision =
				(NcbjAppBoardDecision)result;

			if (!Objects.equals(caseId, ncbjAppBoardDecision.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_NCBJAPPBOARDDECISION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCBJ_CD_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETNCBJ_CD_CI_CASEID_2);
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

				List<NcbjAppBoardDecision> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetNcbj_CD_CI, finderArgs, list);
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
								"NcbjAppBoardDecisionPersistenceImpl.fetchBygetNcbj_CD_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NcbjAppBoardDecision ncbjAppBoardDecision = list.get(0);

					result = ncbjAppBoardDecision;

					cacheResult(ncbjAppBoardDecision);
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
			return (NcbjAppBoardDecision)result;
		}
	}

	/**
	 * Removes the ncbj app board decision where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the ncbj app board decision that was removed
	 */
	@Override
	public NcbjAppBoardDecision removeBygetNcbj_CD_CI(String caseId)
		throws NoSuchNcbjAppBoardDecisionException {

		NcbjAppBoardDecision ncbjAppBoardDecision = findBygetNcbj_CD_CI(caseId);

		return remove(ncbjAppBoardDecision);
	}

	/**
	 * Returns the number of ncbj app board decisions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ncbj app board decisions
	 */
	@Override
	public int countBygetNcbj_CD_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetNcbj_CD_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJAPPBOARDDECISION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCBJ_CD_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETNCBJ_CD_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETNCBJ_CD_CI_CASEID_2 =
		"ncbjAppBoardDecision.caseId = ?";

	private static final String _FINDER_COLUMN_GETNCBJ_CD_CI_CASEID_3 =
		"(ncbjAppBoardDecision.caseId IS NULL OR ncbjAppBoardDecision.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetNcbj_By_CD;
	private FinderPath _finderPathWithoutPaginationFindBygetNcbj_By_CD;
	private FinderPath _finderPathCountBygetNcbj_By_CD;

	/**
	 * Returns all the ncbj app board decisions where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @return the matching ncbj app board decisions
	 */
	@Override
	public List<NcbjAppBoardDecision> findBygetNcbj_By_CD(
		String committeeDecision) {

		return findBygetNcbj_By_CD(
			committeeDecision, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj app board decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjAppBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of ncbj app board decisions
	 * @param end the upper bound of the range of ncbj app board decisions (not inclusive)
	 * @return the range of matching ncbj app board decisions
	 */
	@Override
	public List<NcbjAppBoardDecision> findBygetNcbj_By_CD(
		String committeeDecision, int start, int end) {

		return findBygetNcbj_By_CD(committeeDecision, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj app board decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjAppBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of ncbj app board decisions
	 * @param end the upper bound of the range of ncbj app board decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj app board decisions
	 */
	@Override
	public List<NcbjAppBoardDecision> findBygetNcbj_By_CD(
		String committeeDecision, int start, int end,
		OrderByComparator<NcbjAppBoardDecision> orderByComparator) {

		return findBygetNcbj_By_CD(
			committeeDecision, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj app board decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjAppBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of ncbj app board decisions
	 * @param end the upper bound of the range of ncbj app board decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj app board decisions
	 */
	@Override
	public List<NcbjAppBoardDecision> findBygetNcbj_By_CD(
		String committeeDecision, int start, int end,
		OrderByComparator<NcbjAppBoardDecision> orderByComparator,
		boolean useFinderCache) {

		committeeDecision = Objects.toString(committeeDecision, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetNcbj_By_CD;
				finderArgs = new Object[] {committeeDecision};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetNcbj_By_CD;
			finderArgs = new Object[] {
				committeeDecision, start, end, orderByComparator
			};
		}

		List<NcbjAppBoardDecision> list = null;

		if (useFinderCache) {
			list = (List<NcbjAppBoardDecision>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (NcbjAppBoardDecision ncbjAppBoardDecision : list) {
					if (!committeeDecision.equals(
							ncbjAppBoardDecision.getCommitteeDecision())) {

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

			sb.append(_SQL_SELECT_NCBJAPPBOARDDECISION_WHERE);

			boolean bindCommitteeDecision = false;

			if (committeeDecision.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCBJ_BY_CD_COMMITTEEDECISION_3);
			}
			else {
				bindCommitteeDecision = true;

				sb.append(_FINDER_COLUMN_GETNCBJ_BY_CD_COMMITTEEDECISION_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(NcbjAppBoardDecisionModelImpl.ORDER_BY_JPQL);
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

				list = (List<NcbjAppBoardDecision>)QueryUtil.list(
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
	 * Returns the first ncbj app board decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj app board decision
	 * @throws NoSuchNcbjAppBoardDecisionException if a matching ncbj app board decision could not be found
	 */
	@Override
	public NcbjAppBoardDecision findBygetNcbj_By_CD_First(
			String committeeDecision,
			OrderByComparator<NcbjAppBoardDecision> orderByComparator)
		throws NoSuchNcbjAppBoardDecisionException {

		NcbjAppBoardDecision ncbjAppBoardDecision = fetchBygetNcbj_By_CD_First(
			committeeDecision, orderByComparator);

		if (ncbjAppBoardDecision != null) {
			return ncbjAppBoardDecision;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("committeeDecision=");
		sb.append(committeeDecision);

		sb.append("}");

		throw new NoSuchNcbjAppBoardDecisionException(sb.toString());
	}

	/**
	 * Returns the first ncbj app board decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj app board decision, or <code>null</code> if a matching ncbj app board decision could not be found
	 */
	@Override
	public NcbjAppBoardDecision fetchBygetNcbj_By_CD_First(
		String committeeDecision,
		OrderByComparator<NcbjAppBoardDecision> orderByComparator) {

		List<NcbjAppBoardDecision> list = findBygetNcbj_By_CD(
			committeeDecision, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ncbj app board decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj app board decision
	 * @throws NoSuchNcbjAppBoardDecisionException if a matching ncbj app board decision could not be found
	 */
	@Override
	public NcbjAppBoardDecision findBygetNcbj_By_CD_Last(
			String committeeDecision,
			OrderByComparator<NcbjAppBoardDecision> orderByComparator)
		throws NoSuchNcbjAppBoardDecisionException {

		NcbjAppBoardDecision ncbjAppBoardDecision = fetchBygetNcbj_By_CD_Last(
			committeeDecision, orderByComparator);

		if (ncbjAppBoardDecision != null) {
			return ncbjAppBoardDecision;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("committeeDecision=");
		sb.append(committeeDecision);

		sb.append("}");

		throw new NoSuchNcbjAppBoardDecisionException(sb.toString());
	}

	/**
	 * Returns the last ncbj app board decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj app board decision, or <code>null</code> if a matching ncbj app board decision could not be found
	 */
	@Override
	public NcbjAppBoardDecision fetchBygetNcbj_By_CD_Last(
		String committeeDecision,
		OrderByComparator<NcbjAppBoardDecision> orderByComparator) {

		int count = countBygetNcbj_By_CD(committeeDecision);

		if (count == 0) {
			return null;
		}

		List<NcbjAppBoardDecision> list = findBygetNcbj_By_CD(
			committeeDecision, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ncbj app board decisions before and after the current ncbj app board decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param ncbjAppBoardDecisionId the primary key of the current ncbj app board decision
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj app board decision
	 * @throws NoSuchNcbjAppBoardDecisionException if a ncbj app board decision with the primary key could not be found
	 */
	@Override
	public NcbjAppBoardDecision[] findBygetNcbj_By_CD_PrevAndNext(
			long ncbjAppBoardDecisionId, String committeeDecision,
			OrderByComparator<NcbjAppBoardDecision> orderByComparator)
		throws NoSuchNcbjAppBoardDecisionException {

		committeeDecision = Objects.toString(committeeDecision, "");

		NcbjAppBoardDecision ncbjAppBoardDecision = findByPrimaryKey(
			ncbjAppBoardDecisionId);

		Session session = null;

		try {
			session = openSession();

			NcbjAppBoardDecision[] array = new NcbjAppBoardDecisionImpl[3];

			array[0] = getBygetNcbj_By_CD_PrevAndNext(
				session, ncbjAppBoardDecision, committeeDecision,
				orderByComparator, true);

			array[1] = ncbjAppBoardDecision;

			array[2] = getBygetNcbj_By_CD_PrevAndNext(
				session, ncbjAppBoardDecision, committeeDecision,
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

	protected NcbjAppBoardDecision getBygetNcbj_By_CD_PrevAndNext(
		Session session, NcbjAppBoardDecision ncbjAppBoardDecision,
		String committeeDecision,
		OrderByComparator<NcbjAppBoardDecision> orderByComparator,
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

		sb.append(_SQL_SELECT_NCBJAPPBOARDDECISION_WHERE);

		boolean bindCommitteeDecision = false;

		if (committeeDecision.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETNCBJ_BY_CD_COMMITTEEDECISION_3);
		}
		else {
			bindCommitteeDecision = true;

			sb.append(_FINDER_COLUMN_GETNCBJ_BY_CD_COMMITTEEDECISION_2);
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
			sb.append(NcbjAppBoardDecisionModelImpl.ORDER_BY_JPQL);
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
						ncbjAppBoardDecision)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NcbjAppBoardDecision> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ncbj app board decisions where committeeDecision = &#63; from the database.
	 *
	 * @param committeeDecision the committee decision
	 */
	@Override
	public void removeBygetNcbj_By_CD(String committeeDecision) {
		for (NcbjAppBoardDecision ncbjAppBoardDecision :
				findBygetNcbj_By_CD(
					committeeDecision, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(ncbjAppBoardDecision);
		}
	}

	/**
	 * Returns the number of ncbj app board decisions where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @return the number of matching ncbj app board decisions
	 */
	@Override
	public int countBygetNcbj_By_CD(String committeeDecision) {
		committeeDecision = Objects.toString(committeeDecision, "");

		FinderPath finderPath = _finderPathCountBygetNcbj_By_CD;

		Object[] finderArgs = new Object[] {committeeDecision};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJAPPBOARDDECISION_WHERE);

			boolean bindCommitteeDecision = false;

			if (committeeDecision.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCBJ_BY_CD_COMMITTEEDECISION_3);
			}
			else {
				bindCommitteeDecision = true;

				sb.append(_FINDER_COLUMN_GETNCBJ_BY_CD_COMMITTEEDECISION_2);
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
		_FINDER_COLUMN_GETNCBJ_BY_CD_COMMITTEEDECISION_2 =
			"ncbjAppBoardDecision.committeeDecision = ?";

	private static final String
		_FINDER_COLUMN_GETNCBJ_BY_CD_COMMITTEEDECISION_3 =
			"(ncbjAppBoardDecision.committeeDecision IS NULL OR ncbjAppBoardDecision.committeeDecision = '')";

	public NcbjAppBoardDecisionPersistenceImpl() {
		setModelClass(NcbjAppBoardDecision.class);

		setModelImplClass(NcbjAppBoardDecisionImpl.class);
		setModelPKClass(long.class);

		setTable(NcbjAppBoardDecisionTable.INSTANCE);
	}

	/**
	 * Caches the ncbj app board decision in the entity cache if it is enabled.
	 *
	 * @param ncbjAppBoardDecision the ncbj app board decision
	 */
	@Override
	public void cacheResult(NcbjAppBoardDecision ncbjAppBoardDecision) {
		entityCache.putResult(
			NcbjAppBoardDecisionImpl.class,
			ncbjAppBoardDecision.getPrimaryKey(), ncbjAppBoardDecision);

		finderCache.putResult(
			_finderPathFetchBygetNcbj_CD_CI,
			new Object[] {ncbjAppBoardDecision.getCaseId()},
			ncbjAppBoardDecision);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the ncbj app board decisions in the entity cache if it is enabled.
	 *
	 * @param ncbjAppBoardDecisions the ncbj app board decisions
	 */
	@Override
	public void cacheResult(List<NcbjAppBoardDecision> ncbjAppBoardDecisions) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (ncbjAppBoardDecisions.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (NcbjAppBoardDecision ncbjAppBoardDecision :
				ncbjAppBoardDecisions) {

			if (entityCache.getResult(
					NcbjAppBoardDecisionImpl.class,
					ncbjAppBoardDecision.getPrimaryKey()) == null) {

				cacheResult(ncbjAppBoardDecision);
			}
		}
	}

	/**
	 * Clears the cache for all ncbj app board decisions.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NcbjAppBoardDecisionImpl.class);

		finderCache.clearCache(NcbjAppBoardDecisionImpl.class);
	}

	/**
	 * Clears the cache for the ncbj app board decision.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NcbjAppBoardDecision ncbjAppBoardDecision) {
		entityCache.removeResult(
			NcbjAppBoardDecisionImpl.class, ncbjAppBoardDecision);
	}

	@Override
	public void clearCache(List<NcbjAppBoardDecision> ncbjAppBoardDecisions) {
		for (NcbjAppBoardDecision ncbjAppBoardDecision :
				ncbjAppBoardDecisions) {

			entityCache.removeResult(
				NcbjAppBoardDecisionImpl.class, ncbjAppBoardDecision);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(NcbjAppBoardDecisionImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				NcbjAppBoardDecisionImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		NcbjAppBoardDecisionModelImpl ncbjAppBoardDecisionModelImpl) {

		Object[] args = new Object[] {
			ncbjAppBoardDecisionModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetNcbj_CD_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetNcbj_CD_CI, args,
			ncbjAppBoardDecisionModelImpl);
	}

	/**
	 * Creates a new ncbj app board decision with the primary key. Does not add the ncbj app board decision to the database.
	 *
	 * @param ncbjAppBoardDecisionId the primary key for the new ncbj app board decision
	 * @return the new ncbj app board decision
	 */
	@Override
	public NcbjAppBoardDecision create(long ncbjAppBoardDecisionId) {
		NcbjAppBoardDecision ncbjAppBoardDecision =
			new NcbjAppBoardDecisionImpl();

		ncbjAppBoardDecision.setNew(true);
		ncbjAppBoardDecision.setPrimaryKey(ncbjAppBoardDecisionId);

		ncbjAppBoardDecision.setCompanyId(CompanyThreadLocal.getCompanyId());

		return ncbjAppBoardDecision;
	}

	/**
	 * Removes the ncbj app board decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjAppBoardDecisionId the primary key of the ncbj app board decision
	 * @return the ncbj app board decision that was removed
	 * @throws NoSuchNcbjAppBoardDecisionException if a ncbj app board decision with the primary key could not be found
	 */
	@Override
	public NcbjAppBoardDecision remove(long ncbjAppBoardDecisionId)
		throws NoSuchNcbjAppBoardDecisionException {

		return remove((Serializable)ncbjAppBoardDecisionId);
	}

	/**
	 * Removes the ncbj app board decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ncbj app board decision
	 * @return the ncbj app board decision that was removed
	 * @throws NoSuchNcbjAppBoardDecisionException if a ncbj app board decision with the primary key could not be found
	 */
	@Override
	public NcbjAppBoardDecision remove(Serializable primaryKey)
		throws NoSuchNcbjAppBoardDecisionException {

		Session session = null;

		try {
			session = openSession();

			NcbjAppBoardDecision ncbjAppBoardDecision =
				(NcbjAppBoardDecision)session.get(
					NcbjAppBoardDecisionImpl.class, primaryKey);

			if (ncbjAppBoardDecision == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNcbjAppBoardDecisionException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(ncbjAppBoardDecision);
		}
		catch (NoSuchNcbjAppBoardDecisionException noSuchEntityException) {
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
	protected NcbjAppBoardDecision removeImpl(
		NcbjAppBoardDecision ncbjAppBoardDecision) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ncbjAppBoardDecision)) {
				ncbjAppBoardDecision = (NcbjAppBoardDecision)session.get(
					NcbjAppBoardDecisionImpl.class,
					ncbjAppBoardDecision.getPrimaryKeyObj());
			}

			if (ncbjAppBoardDecision != null) {
				session.delete(ncbjAppBoardDecision);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (ncbjAppBoardDecision != null) {
			clearCache(ncbjAppBoardDecision);
		}

		return ncbjAppBoardDecision;
	}

	@Override
	public NcbjAppBoardDecision updateImpl(
		NcbjAppBoardDecision ncbjAppBoardDecision) {

		boolean isNew = ncbjAppBoardDecision.isNew();

		if (!(ncbjAppBoardDecision instanceof NcbjAppBoardDecisionModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(ncbjAppBoardDecision.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					ncbjAppBoardDecision);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in ncbjAppBoardDecision proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom NcbjAppBoardDecision implementation " +
					ncbjAppBoardDecision.getClass());
		}

		NcbjAppBoardDecisionModelImpl ncbjAppBoardDecisionModelImpl =
			(NcbjAppBoardDecisionModelImpl)ncbjAppBoardDecision;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (ncbjAppBoardDecision.getCreateDate() == null)) {
			if (serviceContext == null) {
				ncbjAppBoardDecision.setCreateDate(date);
			}
			else {
				ncbjAppBoardDecision.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!ncbjAppBoardDecisionModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				ncbjAppBoardDecision.setModifiedDate(date);
			}
			else {
				ncbjAppBoardDecision.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(ncbjAppBoardDecision);
			}
			else {
				ncbjAppBoardDecision = (NcbjAppBoardDecision)session.merge(
					ncbjAppBoardDecision);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			NcbjAppBoardDecisionImpl.class, ncbjAppBoardDecisionModelImpl,
			false, true);

		cacheUniqueFindersCache(ncbjAppBoardDecisionModelImpl);

		if (isNew) {
			ncbjAppBoardDecision.setNew(false);
		}

		ncbjAppBoardDecision.resetOriginalValues();

		return ncbjAppBoardDecision;
	}

	/**
	 * Returns the ncbj app board decision with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ncbj app board decision
	 * @return the ncbj app board decision
	 * @throws NoSuchNcbjAppBoardDecisionException if a ncbj app board decision with the primary key could not be found
	 */
	@Override
	public NcbjAppBoardDecision findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNcbjAppBoardDecisionException {

		NcbjAppBoardDecision ncbjAppBoardDecision = fetchByPrimaryKey(
			primaryKey);

		if (ncbjAppBoardDecision == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNcbjAppBoardDecisionException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return ncbjAppBoardDecision;
	}

	/**
	 * Returns the ncbj app board decision with the primary key or throws a <code>NoSuchNcbjAppBoardDecisionException</code> if it could not be found.
	 *
	 * @param ncbjAppBoardDecisionId the primary key of the ncbj app board decision
	 * @return the ncbj app board decision
	 * @throws NoSuchNcbjAppBoardDecisionException if a ncbj app board decision with the primary key could not be found
	 */
	@Override
	public NcbjAppBoardDecision findByPrimaryKey(long ncbjAppBoardDecisionId)
		throws NoSuchNcbjAppBoardDecisionException {

		return findByPrimaryKey((Serializable)ncbjAppBoardDecisionId);
	}

	/**
	 * Returns the ncbj app board decision with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjAppBoardDecisionId the primary key of the ncbj app board decision
	 * @return the ncbj app board decision, or <code>null</code> if a ncbj app board decision with the primary key could not be found
	 */
	@Override
	public NcbjAppBoardDecision fetchByPrimaryKey(long ncbjAppBoardDecisionId) {
		return fetchByPrimaryKey((Serializable)ncbjAppBoardDecisionId);
	}

	/**
	 * Returns all the ncbj app board decisions.
	 *
	 * @return the ncbj app board decisions
	 */
	@Override
	public List<NcbjAppBoardDecision> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj app board decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjAppBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj app board decisions
	 * @param end the upper bound of the range of ncbj app board decisions (not inclusive)
	 * @return the range of ncbj app board decisions
	 */
	@Override
	public List<NcbjAppBoardDecision> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj app board decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjAppBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj app board decisions
	 * @param end the upper bound of the range of ncbj app board decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj app board decisions
	 */
	@Override
	public List<NcbjAppBoardDecision> findAll(
		int start, int end,
		OrderByComparator<NcbjAppBoardDecision> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj app board decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjAppBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj app board decisions
	 * @param end the upper bound of the range of ncbj app board decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj app board decisions
	 */
	@Override
	public List<NcbjAppBoardDecision> findAll(
		int start, int end,
		OrderByComparator<NcbjAppBoardDecision> orderByComparator,
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

		List<NcbjAppBoardDecision> list = null;

		if (useFinderCache) {
			list = (List<NcbjAppBoardDecision>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_NCBJAPPBOARDDECISION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_NCBJAPPBOARDDECISION;

				sql = sql.concat(NcbjAppBoardDecisionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<NcbjAppBoardDecision>)QueryUtil.list(
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
	 * Removes all the ncbj app board decisions from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (NcbjAppBoardDecision ncbjAppBoardDecision : findAll()) {
			remove(ncbjAppBoardDecision);
		}
	}

	/**
	 * Returns the number of ncbj app board decisions.
	 *
	 * @return the number of ncbj app board decisions
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
					_SQL_COUNT_NCBJAPPBOARDDECISION);

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
		return "ncbjAppBoardDecisionId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_NCBJAPPBOARDDECISION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return NcbjAppBoardDecisionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ncbj app board decision persistence.
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

		_finderPathFetchBygetNcbj_CD_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetNcbj_CD_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetNcbj_CD_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetNcbj_CD_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetNcbj_By_CD = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetNcbj_By_CD",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"committeeDecision"}, true);

		_finderPathWithoutPaginationFindBygetNcbj_By_CD = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetNcbj_By_CD",
			new String[] {String.class.getName()},
			new String[] {"committeeDecision"}, true);

		_finderPathCountBygetNcbj_By_CD = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetNcbj_By_CD",
			new String[] {String.class.getName()},
			new String[] {"committeeDecision"}, false);

		NcbjAppBoardDecisionUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		NcbjAppBoardDecisionUtil.setPersistence(null);

		entityCache.removeCache(NcbjAppBoardDecisionImpl.class.getName());
	}

	@Override
	@Reference(
		target = NCBJ_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = NCBJ_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = NCBJ_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_NCBJAPPBOARDDECISION =
		"SELECT ncbjAppBoardDecision FROM NcbjAppBoardDecision ncbjAppBoardDecision";

	private static final String _SQL_SELECT_NCBJAPPBOARDDECISION_WHERE =
		"SELECT ncbjAppBoardDecision FROM NcbjAppBoardDecision ncbjAppBoardDecision WHERE ";

	private static final String _SQL_COUNT_NCBJAPPBOARDDECISION =
		"SELECT COUNT(ncbjAppBoardDecision) FROM NcbjAppBoardDecision ncbjAppBoardDecision";

	private static final String _SQL_COUNT_NCBJAPPBOARDDECISION_WHERE =
		"SELECT COUNT(ncbjAppBoardDecision) FROM NcbjAppBoardDecision ncbjAppBoardDecision WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"ncbjAppBoardDecision.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No NcbjAppBoardDecision exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No NcbjAppBoardDecision exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		NcbjAppBoardDecisionPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}