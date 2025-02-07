/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.jtb.application.stage.services.service.persistence.impl;

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
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.jtb.application.stage.services.exception.NoSuchJtbAppBoardDecisionException;
import com.nbp.jtb.application.stage.services.model.JtbAppBoardDecision;
import com.nbp.jtb.application.stage.services.model.JtbAppBoardDecisionTable;
import com.nbp.jtb.application.stage.services.model.impl.JtbAppBoardDecisionImpl;
import com.nbp.jtb.application.stage.services.model.impl.JtbAppBoardDecisionModelImpl;
import com.nbp.jtb.application.stage.services.service.persistence.JtbAppBoardDecisionPersistence;
import com.nbp.jtb.application.stage.services.service.persistence.JtbAppBoardDecisionUtil;
import com.nbp.jtb.application.stage.services.service.persistence.impl.constants.JTB_APPLICATION_STAGEPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.Field;
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
 * The persistence implementation for the jtb app board decision service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	service = {JtbAppBoardDecisionPersistence.class, BasePersistence.class}
)
public class JtbAppBoardDecisionPersistenceImpl
	extends BasePersistenceImpl<JtbAppBoardDecision>
	implements JtbAppBoardDecisionPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>JtbAppBoardDecisionUtil</code> to access the jtb app board decision persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		JtbAppBoardDecisionImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetjtb_CD_CI;
	private FinderPath _finderPathCountBygetjtb_CD_CI;

	/**
	 * Returns the jtb app board decision where caseId = &#63; or throws a <code>NoSuchJtbAppBoardDecisionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching jtb app board decision
	 * @throws NoSuchJtbAppBoardDecisionException if a matching jtb app board decision could not be found
	 */
	@Override
	public JtbAppBoardDecision findBygetjtb_CD_CI(String caseId)
		throws NoSuchJtbAppBoardDecisionException {

		JtbAppBoardDecision jtbAppBoardDecision = fetchBygetjtb_CD_CI(caseId);

		if (jtbAppBoardDecision == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchJtbAppBoardDecisionException(sb.toString());
		}

		return jtbAppBoardDecision;
	}

	/**
	 * Returns the jtb app board decision where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching jtb app board decision, or <code>null</code> if a matching jtb app board decision could not be found
	 */
	@Override
	public JtbAppBoardDecision fetchBygetjtb_CD_CI(String caseId) {
		return fetchBygetjtb_CD_CI(caseId, true);
	}

	/**
	 * Returns the jtb app board decision where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb app board decision, or <code>null</code> if a matching jtb app board decision could not be found
	 */
	@Override
	public JtbAppBoardDecision fetchBygetjtb_CD_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetjtb_CD_CI, finderArgs,this);
		}

		if (result instanceof JtbAppBoardDecision) {
			JtbAppBoardDecision jtbAppBoardDecision =
				(JtbAppBoardDecision)result;

			if (!Objects.equals(caseId, jtbAppBoardDecision.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_JTBAPPBOARDDECISION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJTB_CD_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJTB_CD_CI_CASEID_2);
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

				List<JtbAppBoardDecision> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetjtb_CD_CI, finderArgs, list);
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
								"JtbAppBoardDecisionPersistenceImpl.fetchBygetjtb_CD_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JtbAppBoardDecision jtbAppBoardDecision = list.get(0);

					result = jtbAppBoardDecision;

					cacheResult(jtbAppBoardDecision);
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
			return (JtbAppBoardDecision)result;
		}
	}

	/**
	 * Removes the jtb app board decision where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the jtb app board decision that was removed
	 */
	@Override
	public JtbAppBoardDecision removeBygetjtb_CD_CI(String caseId)
		throws NoSuchJtbAppBoardDecisionException {

		JtbAppBoardDecision jtbAppBoardDecision = findBygetjtb_CD_CI(caseId);

		return remove(jtbAppBoardDecision);
	}

	/**
	 * Returns the number of jtb app board decisions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jtb app board decisions
	 */
	@Override
	public int countBygetjtb_CD_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetjtb_CD_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JTBAPPBOARDDECISION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJTB_CD_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJTB_CD_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETJTB_CD_CI_CASEID_2 =
		"jtbAppBoardDecision.caseId = ?";

	private static final String _FINDER_COLUMN_GETJTB_CD_CI_CASEID_3 =
		"(jtbAppBoardDecision.caseId IS NULL OR jtbAppBoardDecision.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetjtb_By_CD;
	private FinderPath _finderPathWithoutPaginationFindBygetjtb_By_CD;
	private FinderPath _finderPathCountBygetjtb_By_CD;

	/**
	 * Returns all the jtb app board decisions where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @return the matching jtb app board decisions
	 */
	@Override
	public List<JtbAppBoardDecision> findBygetjtb_By_CD(
		String committeeDecision) {

		return findBygetjtb_By_CD(
			committeeDecision, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jtb app board decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAppBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of jtb app board decisions
	 * @param end the upper bound of the range of jtb app board decisions (not inclusive)
	 * @return the range of matching jtb app board decisions
	 */
	@Override
	public List<JtbAppBoardDecision> findBygetjtb_By_CD(
		String committeeDecision, int start, int end) {

		return findBygetjtb_By_CD(committeeDecision, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jtb app board decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAppBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of jtb app board decisions
	 * @param end the upper bound of the range of jtb app board decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb app board decisions
	 */
	@Override
	public List<JtbAppBoardDecision> findBygetjtb_By_CD(
		String committeeDecision, int start, int end,
		OrderByComparator<JtbAppBoardDecision> orderByComparator) {

		return findBygetjtb_By_CD(
			committeeDecision, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jtb app board decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAppBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of jtb app board decisions
	 * @param end the upper bound of the range of jtb app board decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb app board decisions
	 */
	@Override
	public List<JtbAppBoardDecision> findBygetjtb_By_CD(
		String committeeDecision, int start, int end,
		OrderByComparator<JtbAppBoardDecision> orderByComparator,
		boolean useFinderCache) {

		committeeDecision = Objects.toString(committeeDecision, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetjtb_By_CD;
				finderArgs = new Object[] {committeeDecision};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetjtb_By_CD;
			finderArgs = new Object[] {
				committeeDecision, start, end, orderByComparator
			};
		}

		List<JtbAppBoardDecision> list = null;

		if (useFinderCache) {
			list = (List<JtbAppBoardDecision>)finderCache.getResult(
				finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (JtbAppBoardDecision jtbAppBoardDecision : list) {
					if (!committeeDecision.equals(
							jtbAppBoardDecision.getCommitteeDecision())) {

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

			sb.append(_SQL_SELECT_JTBAPPBOARDDECISION_WHERE);

			boolean bindCommitteeDecision = false;

			if (committeeDecision.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJTB_BY_CD_COMMITTEEDECISION_3);
			}
			else {
				bindCommitteeDecision = true;

				sb.append(_FINDER_COLUMN_GETJTB_BY_CD_COMMITTEEDECISION_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(JtbAppBoardDecisionModelImpl.ORDER_BY_JPQL);
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

				list = (List<JtbAppBoardDecision>)QueryUtil.list(
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
	 * Returns the first jtb app board decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb app board decision
	 * @throws NoSuchJtbAppBoardDecisionException if a matching jtb app board decision could not be found
	 */
	@Override
	public JtbAppBoardDecision findBygetjtb_By_CD_First(
			String committeeDecision,
			OrderByComparator<JtbAppBoardDecision> orderByComparator)
		throws NoSuchJtbAppBoardDecisionException {

		JtbAppBoardDecision jtbAppBoardDecision = fetchBygetjtb_By_CD_First(
			committeeDecision, orderByComparator);

		if (jtbAppBoardDecision != null) {
			return jtbAppBoardDecision;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("committeeDecision=");
		sb.append(committeeDecision);

		sb.append("}");

		throw new NoSuchJtbAppBoardDecisionException(sb.toString());
	}

	/**
	 * Returns the first jtb app board decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb app board decision, or <code>null</code> if a matching jtb app board decision could not be found
	 */
	@Override
	public JtbAppBoardDecision fetchBygetjtb_By_CD_First(
		String committeeDecision,
		OrderByComparator<JtbAppBoardDecision> orderByComparator) {

		List<JtbAppBoardDecision> list = findBygetjtb_By_CD(
			committeeDecision, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jtb app board decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb app board decision
	 * @throws NoSuchJtbAppBoardDecisionException if a matching jtb app board decision could not be found
	 */
	@Override
	public JtbAppBoardDecision findBygetjtb_By_CD_Last(
			String committeeDecision,
			OrderByComparator<JtbAppBoardDecision> orderByComparator)
		throws NoSuchJtbAppBoardDecisionException {

		JtbAppBoardDecision jtbAppBoardDecision = fetchBygetjtb_By_CD_Last(
			committeeDecision, orderByComparator);

		if (jtbAppBoardDecision != null) {
			return jtbAppBoardDecision;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("committeeDecision=");
		sb.append(committeeDecision);

		sb.append("}");

		throw new NoSuchJtbAppBoardDecisionException(sb.toString());
	}

	/**
	 * Returns the last jtb app board decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb app board decision, or <code>null</code> if a matching jtb app board decision could not be found
	 */
	@Override
	public JtbAppBoardDecision fetchBygetjtb_By_CD_Last(
		String committeeDecision,
		OrderByComparator<JtbAppBoardDecision> orderByComparator) {

		int count = countBygetjtb_By_CD(committeeDecision);

		if (count == 0) {
			return null;
		}

		List<JtbAppBoardDecision> list = findBygetjtb_By_CD(
			committeeDecision, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jtb app board decisions before and after the current jtb app board decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param jtbAppDeciBoardDecisionId the primary key of the current jtb app board decision
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb app board decision
	 * @throws NoSuchJtbAppBoardDecisionException if a jtb app board decision with the primary key could not be found
	 */
	@Override
	public JtbAppBoardDecision[] findBygetjtb_By_CD_PrevAndNext(
			long jtbAppDeciBoardDecisionId, String committeeDecision,
			OrderByComparator<JtbAppBoardDecision> orderByComparator)
		throws NoSuchJtbAppBoardDecisionException {

		committeeDecision = Objects.toString(committeeDecision, "");

		JtbAppBoardDecision jtbAppBoardDecision = findByPrimaryKey(
			jtbAppDeciBoardDecisionId);

		Session session = null;

		try {
			session = openSession();

			JtbAppBoardDecision[] array = new JtbAppBoardDecisionImpl[3];

			array[0] = getBygetjtb_By_CD_PrevAndNext(
				session, jtbAppBoardDecision, committeeDecision,
				orderByComparator, true);

			array[1] = jtbAppBoardDecision;

			array[2] = getBygetjtb_By_CD_PrevAndNext(
				session, jtbAppBoardDecision, committeeDecision,
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

	protected JtbAppBoardDecision getBygetjtb_By_CD_PrevAndNext(
		Session session, JtbAppBoardDecision jtbAppBoardDecision,
		String committeeDecision,
		OrderByComparator<JtbAppBoardDecision> orderByComparator,
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

		sb.append(_SQL_SELECT_JTBAPPBOARDDECISION_WHERE);

		boolean bindCommitteeDecision = false;

		if (committeeDecision.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETJTB_BY_CD_COMMITTEEDECISION_3);
		}
		else {
			bindCommitteeDecision = true;

			sb.append(_FINDER_COLUMN_GETJTB_BY_CD_COMMITTEEDECISION_2);
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
			sb.append(JtbAppBoardDecisionModelImpl.ORDER_BY_JPQL);
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
						jtbAppBoardDecision)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JtbAppBoardDecision> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jtb app board decisions where committeeDecision = &#63; from the database.
	 *
	 * @param committeeDecision the committee decision
	 */
	@Override
	public void removeBygetjtb_By_CD(String committeeDecision) {
		for (JtbAppBoardDecision jtbAppBoardDecision :
				findBygetjtb_By_CD(
					committeeDecision, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(jtbAppBoardDecision);
		}
	}

	/**
	 * Returns the number of jtb app board decisions where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @return the number of matching jtb app board decisions
	 */
	@Override
	public int countBygetjtb_By_CD(String committeeDecision) {
		committeeDecision = Objects.toString(committeeDecision, "");

		FinderPath finderPath = _finderPathCountBygetjtb_By_CD;

		Object[] finderArgs = new Object[] {committeeDecision};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JTBAPPBOARDDECISION_WHERE);

			boolean bindCommitteeDecision = false;

			if (committeeDecision.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJTB_BY_CD_COMMITTEEDECISION_3);
			}
			else {
				bindCommitteeDecision = true;

				sb.append(_FINDER_COLUMN_GETJTB_BY_CD_COMMITTEEDECISION_2);
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
		_FINDER_COLUMN_GETJTB_BY_CD_COMMITTEEDECISION_2 =
			"jtbAppBoardDecision.committeeDecision = ?";

	private static final String
		_FINDER_COLUMN_GETJTB_BY_CD_COMMITTEEDECISION_3 =
			"(jtbAppBoardDecision.committeeDecision IS NULL OR jtbAppBoardDecision.committeeDecision = '')";

	public JtbAppBoardDecisionPersistenceImpl() {
		setModelClass(JtbAppBoardDecision.class);

		setModelImplClass(JtbAppBoardDecisionImpl.class);
		setModelPKClass(long.class);

		setTable(JtbAppBoardDecisionTable.INSTANCE);
	}

	/**
	 * Caches the jtb app board decision in the entity cache if it is enabled.
	 *
	 * @param jtbAppBoardDecision the jtb app board decision
	 */
	@Override
	public void cacheResult(JtbAppBoardDecision jtbAppBoardDecision) {
		entityCache.putResult(
			JtbAppBoardDecisionImpl.class, jtbAppBoardDecision.getPrimaryKey(),
			jtbAppBoardDecision);

		finderCache.putResult(
			_finderPathFetchBygetjtb_CD_CI,
			new Object[] {jtbAppBoardDecision.getCaseId()},
			jtbAppBoardDecision);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the jtb app board decisions in the entity cache if it is enabled.
	 *
	 * @param jtbAppBoardDecisions the jtb app board decisions
	 */
	@Override
	public void cacheResult(List<JtbAppBoardDecision> jtbAppBoardDecisions) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (jtbAppBoardDecisions.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (JtbAppBoardDecision jtbAppBoardDecision : jtbAppBoardDecisions) {
			if (entityCache.getResult(
					JtbAppBoardDecisionImpl.class,
					jtbAppBoardDecision.getPrimaryKey()) == null) {

				cacheResult(jtbAppBoardDecision);
			}
		}
	}

	/**
	 * Clears the cache for all jtb app board decisions.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(JtbAppBoardDecisionImpl.class);

		finderCache.clearCache(JtbAppBoardDecisionImpl.class);
	}

	/**
	 * Clears the cache for the jtb app board decision.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(JtbAppBoardDecision jtbAppBoardDecision) {
		entityCache.removeResult(
			JtbAppBoardDecisionImpl.class, jtbAppBoardDecision);
	}

	@Override
	public void clearCache(List<JtbAppBoardDecision> jtbAppBoardDecisions) {
		for (JtbAppBoardDecision jtbAppBoardDecision : jtbAppBoardDecisions) {
			entityCache.removeResult(
				JtbAppBoardDecisionImpl.class, jtbAppBoardDecision);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(JtbAppBoardDecisionImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(JtbAppBoardDecisionImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		JtbAppBoardDecisionModelImpl jtbAppBoardDecisionModelImpl) {

		Object[] args = new Object[] {jtbAppBoardDecisionModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetjtb_CD_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetjtb_CD_CI, args, jtbAppBoardDecisionModelImpl);
	}

	/**
	 * Creates a new jtb app board decision with the primary key. Does not add the jtb app board decision to the database.
	 *
	 * @param jtbAppDeciBoardDecisionId the primary key for the new jtb app board decision
	 * @return the new jtb app board decision
	 */
	@Override
	public JtbAppBoardDecision create(long jtbAppDeciBoardDecisionId) {
		JtbAppBoardDecision jtbAppBoardDecision = new JtbAppBoardDecisionImpl();

		jtbAppBoardDecision.setNew(true);
		jtbAppBoardDecision.setPrimaryKey(jtbAppDeciBoardDecisionId);

		jtbAppBoardDecision.setCompanyId(CompanyThreadLocal.getCompanyId());

		return jtbAppBoardDecision;
	}

	/**
	 * Removes the jtb app board decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jtbAppDeciBoardDecisionId the primary key of the jtb app board decision
	 * @return the jtb app board decision that was removed
	 * @throws NoSuchJtbAppBoardDecisionException if a jtb app board decision with the primary key could not be found
	 */
	@Override
	public JtbAppBoardDecision remove(long jtbAppDeciBoardDecisionId)
		throws NoSuchJtbAppBoardDecisionException {

		return remove((Serializable)jtbAppDeciBoardDecisionId);
	}

	/**
	 * Removes the jtb app board decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the jtb app board decision
	 * @return the jtb app board decision that was removed
	 * @throws NoSuchJtbAppBoardDecisionException if a jtb app board decision with the primary key could not be found
	 */
	@Override
	public JtbAppBoardDecision remove(Serializable primaryKey)
		throws NoSuchJtbAppBoardDecisionException {

		Session session = null;

		try {
			session = openSession();

			JtbAppBoardDecision jtbAppBoardDecision =
				(JtbAppBoardDecision)session.get(
					JtbAppBoardDecisionImpl.class, primaryKey);

			if (jtbAppBoardDecision == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJtbAppBoardDecisionException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(jtbAppBoardDecision);
		}
		catch (NoSuchJtbAppBoardDecisionException noSuchEntityException) {
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
	protected JtbAppBoardDecision removeImpl(
		JtbAppBoardDecision jtbAppBoardDecision) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(jtbAppBoardDecision)) {
				jtbAppBoardDecision = (JtbAppBoardDecision)session.get(
					JtbAppBoardDecisionImpl.class,
					jtbAppBoardDecision.getPrimaryKeyObj());
			}

			if (jtbAppBoardDecision != null) {
				session.delete(jtbAppBoardDecision);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (jtbAppBoardDecision != null) {
			clearCache(jtbAppBoardDecision);
		}

		return jtbAppBoardDecision;
	}

	@Override
	public JtbAppBoardDecision updateImpl(
		JtbAppBoardDecision jtbAppBoardDecision) {

		boolean isNew = jtbAppBoardDecision.isNew();

		if (!(jtbAppBoardDecision instanceof JtbAppBoardDecisionModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(jtbAppBoardDecision.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					jtbAppBoardDecision);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in jtbAppBoardDecision proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom JtbAppBoardDecision implementation " +
					jtbAppBoardDecision.getClass());
		}

		JtbAppBoardDecisionModelImpl jtbAppBoardDecisionModelImpl =
			(JtbAppBoardDecisionModelImpl)jtbAppBoardDecision;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (jtbAppBoardDecision.getCreateDate() == null)) {
			if (serviceContext == null) {
				jtbAppBoardDecision.setCreateDate(date);
			}
			else {
				jtbAppBoardDecision.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!jtbAppBoardDecisionModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				jtbAppBoardDecision.setModifiedDate(date);
			}
			else {
				jtbAppBoardDecision.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(jtbAppBoardDecision);
			}
			else {
				jtbAppBoardDecision = (JtbAppBoardDecision)session.merge(
					jtbAppBoardDecision);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			JtbAppBoardDecisionImpl.class, jtbAppBoardDecisionModelImpl, false,
			true);

		cacheUniqueFindersCache(jtbAppBoardDecisionModelImpl);

		if (isNew) {
			jtbAppBoardDecision.setNew(false);
		}

		jtbAppBoardDecision.resetOriginalValues();

		return jtbAppBoardDecision;
	}

	/**
	 * Returns the jtb app board decision with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the jtb app board decision
	 * @return the jtb app board decision
	 * @throws NoSuchJtbAppBoardDecisionException if a jtb app board decision with the primary key could not be found
	 */
	@Override
	public JtbAppBoardDecision findByPrimaryKey(Serializable primaryKey)
		throws NoSuchJtbAppBoardDecisionException {

		JtbAppBoardDecision jtbAppBoardDecision = fetchByPrimaryKey(primaryKey);

		if (jtbAppBoardDecision == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJtbAppBoardDecisionException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return jtbAppBoardDecision;
	}

	/**
	 * Returns the jtb app board decision with the primary key or throws a <code>NoSuchJtbAppBoardDecisionException</code> if it could not be found.
	 *
	 * @param jtbAppDeciBoardDecisionId the primary key of the jtb app board decision
	 * @return the jtb app board decision
	 * @throws NoSuchJtbAppBoardDecisionException if a jtb app board decision with the primary key could not be found
	 */
	@Override
	public JtbAppBoardDecision findByPrimaryKey(long jtbAppDeciBoardDecisionId)
		throws NoSuchJtbAppBoardDecisionException {

		return findByPrimaryKey((Serializable)jtbAppDeciBoardDecisionId);
	}

	/**
	 * Returns the jtb app board decision with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jtbAppDeciBoardDecisionId the primary key of the jtb app board decision
	 * @return the jtb app board decision, or <code>null</code> if a jtb app board decision with the primary key could not be found
	 */
	@Override
	public JtbAppBoardDecision fetchByPrimaryKey(
		long jtbAppDeciBoardDecisionId) {

		return fetchByPrimaryKey((Serializable)jtbAppDeciBoardDecisionId);
	}

	/**
	 * Returns all the jtb app board decisions.
	 *
	 * @return the jtb app board decisions
	 */
	@Override
	public List<JtbAppBoardDecision> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jtb app board decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAppBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb app board decisions
	 * @param end the upper bound of the range of jtb app board decisions (not inclusive)
	 * @return the range of jtb app board decisions
	 */
	@Override
	public List<JtbAppBoardDecision> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the jtb app board decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAppBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb app board decisions
	 * @param end the upper bound of the range of jtb app board decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jtb app board decisions
	 */
	@Override
	public List<JtbAppBoardDecision> findAll(
		int start, int end,
		OrderByComparator<JtbAppBoardDecision> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jtb app board decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAppBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb app board decisions
	 * @param end the upper bound of the range of jtb app board decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jtb app board decisions
	 */
	@Override
	public List<JtbAppBoardDecision> findAll(
		int start, int end,
		OrderByComparator<JtbAppBoardDecision> orderByComparator,
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

		List<JtbAppBoardDecision> list = null;

		if (useFinderCache) {
			list = (List<JtbAppBoardDecision>)finderCache.getResult(
				finderPath, finderArgs,this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_JTBAPPBOARDDECISION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_JTBAPPBOARDDECISION;

				sql = sql.concat(JtbAppBoardDecisionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<JtbAppBoardDecision>)QueryUtil.list(
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
	 * Removes all the jtb app board decisions from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (JtbAppBoardDecision jtbAppBoardDecision : findAll()) {
			remove(jtbAppBoardDecision);
		}
	}

	/**
	 * Returns the number of jtb app board decisions.
	 *
	 * @return the number of jtb app board decisions
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY,this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_JTBAPPBOARDDECISION);

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
		return "jtbAppDeciBoardDecisionId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_JTBAPPBOARDDECISION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return JtbAppBoardDecisionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the jtb app board decision persistence.
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

		_finderPathFetchBygetjtb_CD_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetjtb_CD_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetjtb_CD_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetjtb_CD_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetjtb_By_CD = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetjtb_By_CD",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"committeeDecision"}, true);

		_finderPathWithoutPaginationFindBygetjtb_By_CD = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetjtb_By_CD",
			new String[] {String.class.getName()},
			new String[] {"committeeDecision"}, true);

		_finderPathCountBygetjtb_By_CD = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetjtb_By_CD",
			new String[] {String.class.getName()},
			new String[] {"committeeDecision"}, false);

		_setJtbAppBoardDecisionUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setJtbAppBoardDecisionUtilPersistence(null);

		entityCache.removeCache(JtbAppBoardDecisionImpl.class.getName());
	}

	private void _setJtbAppBoardDecisionUtilPersistence(
		JtbAppBoardDecisionPersistence jtbAppBoardDecisionPersistence) {

		try {
			Field field = JtbAppBoardDecisionUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, jtbAppBoardDecisionPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_STAGEPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_STAGEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_STAGEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_JTBAPPBOARDDECISION =
		"SELECT jtbAppBoardDecision FROM JtbAppBoardDecision jtbAppBoardDecision";

	private static final String _SQL_SELECT_JTBAPPBOARDDECISION_WHERE =
		"SELECT jtbAppBoardDecision FROM JtbAppBoardDecision jtbAppBoardDecision WHERE ";

	private static final String _SQL_COUNT_JTBAPPBOARDDECISION =
		"SELECT COUNT(jtbAppBoardDecision) FROM JtbAppBoardDecision jtbAppBoardDecision";

	private static final String _SQL_COUNT_JTBAPPBOARDDECISION_WHERE =
		"SELECT COUNT(jtbAppBoardDecision) FROM JtbAppBoardDecision jtbAppBoardDecision WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "jtbAppBoardDecision.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No JtbAppBoardDecision exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No JtbAppBoardDecision exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		JtbAppBoardDecisionPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private JtbAppBoardDecisionModelArgumentsResolver
		_jtbAppBoardDecisionModelArgumentsResolver;

}