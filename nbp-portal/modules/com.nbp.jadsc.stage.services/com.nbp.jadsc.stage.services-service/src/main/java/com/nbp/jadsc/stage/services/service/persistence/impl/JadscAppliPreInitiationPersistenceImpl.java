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

package com.nbp.jadsc.stage.services.service.persistence.impl;

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

import com.nbp.jadsc.stage.services.exception.NoSuchJadscAppliPreInitiationException;
import com.nbp.jadsc.stage.services.model.JadscAppliPreInitiation;
import com.nbp.jadsc.stage.services.model.JadscAppliPreInitiationTable;
import com.nbp.jadsc.stage.services.model.impl.JadscAppliPreInitiationImpl;
import com.nbp.jadsc.stage.services.model.impl.JadscAppliPreInitiationModelImpl;
import com.nbp.jadsc.stage.services.service.persistence.JadscAppliPreInitiationPersistence;
import com.nbp.jadsc.stage.services.service.persistence.JadscAppliPreInitiationUtil;
import com.nbp.jadsc.stage.services.service.persistence.impl.constants.JADSC_STAGESPersistenceConstants;

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
 * The persistence implementation for the jadsc appli pre initiation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	service = {JadscAppliPreInitiationPersistence.class, BasePersistence.class}
)
public class JadscAppliPreInitiationPersistenceImpl
	extends BasePersistenceImpl<JadscAppliPreInitiation>
	implements JadscAppliPreInitiationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>JadscAppliPreInitiationUtil</code> to access the jadsc appli pre initiation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		JadscAppliPreInitiationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetJadsc_PI_CI;
	private FinderPath _finderPathCountBygetJadsc_PI_CI;

	/**
	 * Returns the jadsc appli pre initiation where caseId = &#63; or throws a <code>NoSuchJadscAppliPreInitiationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc appli pre initiation
	 * @throws NoSuchJadscAppliPreInitiationException if a matching jadsc appli pre initiation could not be found
	 */
	@Override
	public JadscAppliPreInitiation findBygetJadsc_PI_CI(String caseId)
		throws NoSuchJadscAppliPreInitiationException {

		JadscAppliPreInitiation jadscAppliPreInitiation = fetchBygetJadsc_PI_CI(
			caseId);

		if (jadscAppliPreInitiation == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchJadscAppliPreInitiationException(sb.toString());
		}

		return jadscAppliPreInitiation;
	}

	/**
	 * Returns the jadsc appli pre initiation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc appli pre initiation, or <code>null</code> if a matching jadsc appli pre initiation could not be found
	 */
	@Override
	public JadscAppliPreInitiation fetchBygetJadsc_PI_CI(String caseId) {
		return fetchBygetJadsc_PI_CI(caseId, true);
	}

	/**
	 * Returns the jadsc appli pre initiation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc appli pre initiation, or <code>null</code> if a matching jadsc appli pre initiation could not be found
	 */
	@Override
	public JadscAppliPreInitiation fetchBygetJadsc_PI_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJadsc_PI_CI, finderArgs,this);
		}

		if (result instanceof JadscAppliPreInitiation) {
			JadscAppliPreInitiation jadscAppliPreInitiation =
				(JadscAppliPreInitiation)result;

			if (!Objects.equals(caseId, jadscAppliPreInitiation.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_JADSCAPPLIPREINITIATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJADSC_PI_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJADSC_PI_CI_CASEID_2);
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

				List<JadscAppliPreInitiation> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJadsc_PI_CI, finderArgs, list);
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
								"JadscAppliPreInitiationPersistenceImpl.fetchBygetJadsc_PI_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JadscAppliPreInitiation jadscAppliPreInitiation = list.get(
						0);

					result = jadscAppliPreInitiation;

					cacheResult(jadscAppliPreInitiation);
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
			return (JadscAppliPreInitiation)result;
		}
	}

	/**
	 * Removes the jadsc appli pre initiation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the jadsc appli pre initiation that was removed
	 */
	@Override
	public JadscAppliPreInitiation removeBygetJadsc_PI_CI(String caseId)
		throws NoSuchJadscAppliPreInitiationException {

		JadscAppliPreInitiation jadscAppliPreInitiation = findBygetJadsc_PI_CI(
			caseId);

		return remove(jadscAppliPreInitiation);
	}

	/**
	 * Returns the number of jadsc appli pre initiations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jadsc appli pre initiations
	 */
	@Override
	public int countBygetJadsc_PI_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetJadsc_PI_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JADSCAPPLIPREINITIATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJADSC_PI_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJADSC_PI_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETJADSC_PI_CI_CASEID_2 =
		"jadscAppliPreInitiation.caseId = ?";

	private static final String _FINDER_COLUMN_GETJADSC_PI_CI_CASEID_3 =
		"(jadscAppliPreInitiation.caseId IS NULL OR jadscAppliPreInitiation.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetJadsc_By_PI;
	private FinderPath _finderPathWithoutPaginationFindBygetJadsc_By_PI;
	private FinderPath _finderPathCountBygetJadsc_By_PI;

	/**
	 * Returns all the jadsc appli pre initiations where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @return the matching jadsc appli pre initiations
	 */
	@Override
	public List<JadscAppliPreInitiation> findBygetJadsc_By_PI(String outcome) {
		return findBygetJadsc_By_PI(
			outcome, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc appli pre initiations where outcome = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliPreInitiationModelImpl</code>.
	 * </p>
	 *
	 * @param outcome the outcome
	 * @param start the lower bound of the range of jadsc appli pre initiations
	 * @param end the upper bound of the range of jadsc appli pre initiations (not inclusive)
	 * @return the range of matching jadsc appli pre initiations
	 */
	@Override
	public List<JadscAppliPreInitiation> findBygetJadsc_By_PI(
		String outcome, int start, int end) {

		return findBygetJadsc_By_PI(outcome, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc appli pre initiations where outcome = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliPreInitiationModelImpl</code>.
	 * </p>
	 *
	 * @param outcome the outcome
	 * @param start the lower bound of the range of jadsc appli pre initiations
	 * @param end the upper bound of the range of jadsc appli pre initiations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc appli pre initiations
	 */
	@Override
	public List<JadscAppliPreInitiation> findBygetJadsc_By_PI(
		String outcome, int start, int end,
		OrderByComparator<JadscAppliPreInitiation> orderByComparator) {

		return findBygetJadsc_By_PI(
			outcome, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc appli pre initiations where outcome = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliPreInitiationModelImpl</code>.
	 * </p>
	 *
	 * @param outcome the outcome
	 * @param start the lower bound of the range of jadsc appli pre initiations
	 * @param end the upper bound of the range of jadsc appli pre initiations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc appli pre initiations
	 */
	@Override
	public List<JadscAppliPreInitiation> findBygetJadsc_By_PI(
		String outcome, int start, int end,
		OrderByComparator<JadscAppliPreInitiation> orderByComparator,
		boolean useFinderCache) {

		outcome = Objects.toString(outcome, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetJadsc_By_PI;
				finderArgs = new Object[] {outcome};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetJadsc_By_PI;
			finderArgs = new Object[] {outcome, start, end, orderByComparator};
		}

		List<JadscAppliPreInitiation> list = null;

		if (useFinderCache) {
			list = (List<JadscAppliPreInitiation>)finderCache.getResult(
				finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (JadscAppliPreInitiation jadscAppliPreInitiation : list) {
					if (!outcome.equals(jadscAppliPreInitiation.getOutcome())) {
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

			sb.append(_SQL_SELECT_JADSCAPPLIPREINITIATION_WHERE);

			boolean bindOutcome = false;

			if (outcome.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJADSC_BY_PI_OUTCOME_3);
			}
			else {
				bindOutcome = true;

				sb.append(_FINDER_COLUMN_GETJADSC_BY_PI_OUTCOME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(JadscAppliPreInitiationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindOutcome) {
					queryPos.add(outcome);
				}

				list = (List<JadscAppliPreInitiation>)QueryUtil.list(
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
	 * Returns the first jadsc appli pre initiation in the ordered set where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc appli pre initiation
	 * @throws NoSuchJadscAppliPreInitiationException if a matching jadsc appli pre initiation could not be found
	 */
	@Override
	public JadscAppliPreInitiation findBygetJadsc_By_PI_First(
			String outcome,
			OrderByComparator<JadscAppliPreInitiation> orderByComparator)
		throws NoSuchJadscAppliPreInitiationException {

		JadscAppliPreInitiation jadscAppliPreInitiation =
			fetchBygetJadsc_By_PI_First(outcome, orderByComparator);

		if (jadscAppliPreInitiation != null) {
			return jadscAppliPreInitiation;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("outcome=");
		sb.append(outcome);

		sb.append("}");

		throw new NoSuchJadscAppliPreInitiationException(sb.toString());
	}

	/**
	 * Returns the first jadsc appli pre initiation in the ordered set where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc appli pre initiation, or <code>null</code> if a matching jadsc appli pre initiation could not be found
	 */
	@Override
	public JadscAppliPreInitiation fetchBygetJadsc_By_PI_First(
		String outcome,
		OrderByComparator<JadscAppliPreInitiation> orderByComparator) {

		List<JadscAppliPreInitiation> list = findBygetJadsc_By_PI(
			outcome, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jadsc appli pre initiation in the ordered set where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc appli pre initiation
	 * @throws NoSuchJadscAppliPreInitiationException if a matching jadsc appli pre initiation could not be found
	 */
	@Override
	public JadscAppliPreInitiation findBygetJadsc_By_PI_Last(
			String outcome,
			OrderByComparator<JadscAppliPreInitiation> orderByComparator)
		throws NoSuchJadscAppliPreInitiationException {

		JadscAppliPreInitiation jadscAppliPreInitiation =
			fetchBygetJadsc_By_PI_Last(outcome, orderByComparator);

		if (jadscAppliPreInitiation != null) {
			return jadscAppliPreInitiation;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("outcome=");
		sb.append(outcome);

		sb.append("}");

		throw new NoSuchJadscAppliPreInitiationException(sb.toString());
	}

	/**
	 * Returns the last jadsc appli pre initiation in the ordered set where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc appli pre initiation, or <code>null</code> if a matching jadsc appli pre initiation could not be found
	 */
	@Override
	public JadscAppliPreInitiation fetchBygetJadsc_By_PI_Last(
		String outcome,
		OrderByComparator<JadscAppliPreInitiation> orderByComparator) {

		int count = countBygetJadsc_By_PI(outcome);

		if (count == 0) {
			return null;
		}

		List<JadscAppliPreInitiation> list = findBygetJadsc_By_PI(
			outcome, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jadsc appli pre initiations before and after the current jadsc appli pre initiation in the ordered set where outcome = &#63;.
	 *
	 * @param jadscAppliPreInitiationId the primary key of the current jadsc appli pre initiation
	 * @param outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc appli pre initiation
	 * @throws NoSuchJadscAppliPreInitiationException if a jadsc appli pre initiation with the primary key could not be found
	 */
	@Override
	public JadscAppliPreInitiation[] findBygetJadsc_By_PI_PrevAndNext(
			long jadscAppliPreInitiationId, String outcome,
			OrderByComparator<JadscAppliPreInitiation> orderByComparator)
		throws NoSuchJadscAppliPreInitiationException {

		outcome = Objects.toString(outcome, "");

		JadscAppliPreInitiation jadscAppliPreInitiation = findByPrimaryKey(
			jadscAppliPreInitiationId);

		Session session = null;

		try {
			session = openSession();

			JadscAppliPreInitiation[] array =
				new JadscAppliPreInitiationImpl[3];

			array[0] = getBygetJadsc_By_PI_PrevAndNext(
				session, jadscAppliPreInitiation, outcome, orderByComparator,
				true);

			array[1] = jadscAppliPreInitiation;

			array[2] = getBygetJadsc_By_PI_PrevAndNext(
				session, jadscAppliPreInitiation, outcome, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected JadscAppliPreInitiation getBygetJadsc_By_PI_PrevAndNext(
		Session session, JadscAppliPreInitiation jadscAppliPreInitiation,
		String outcome,
		OrderByComparator<JadscAppliPreInitiation> orderByComparator,
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

		sb.append(_SQL_SELECT_JADSCAPPLIPREINITIATION_WHERE);

		boolean bindOutcome = false;

		if (outcome.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETJADSC_BY_PI_OUTCOME_3);
		}
		else {
			bindOutcome = true;

			sb.append(_FINDER_COLUMN_GETJADSC_BY_PI_OUTCOME_2);
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
			sb.append(JadscAppliPreInitiationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindOutcome) {
			queryPos.add(outcome);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						jadscAppliPreInitiation)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JadscAppliPreInitiation> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jadsc appli pre initiations where outcome = &#63; from the database.
	 *
	 * @param outcome the outcome
	 */
	@Override
	public void removeBygetJadsc_By_PI(String outcome) {
		for (JadscAppliPreInitiation jadscAppliPreInitiation :
				findBygetJadsc_By_PI(
					outcome, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(jadscAppliPreInitiation);
		}
	}

	/**
	 * Returns the number of jadsc appli pre initiations where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @return the number of matching jadsc appli pre initiations
	 */
	@Override
	public int countBygetJadsc_By_PI(String outcome) {
		outcome = Objects.toString(outcome, "");

		FinderPath finderPath = _finderPathCountBygetJadsc_By_PI;

		Object[] finderArgs = new Object[] {outcome};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JADSCAPPLIPREINITIATION_WHERE);

			boolean bindOutcome = false;

			if (outcome.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJADSC_BY_PI_OUTCOME_3);
			}
			else {
				bindOutcome = true;

				sb.append(_FINDER_COLUMN_GETJADSC_BY_PI_OUTCOME_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindOutcome) {
					queryPos.add(outcome);
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

	private static final String _FINDER_COLUMN_GETJADSC_BY_PI_OUTCOME_2 =
		"jadscAppliPreInitiation.outcome = ?";

	private static final String _FINDER_COLUMN_GETJADSC_BY_PI_OUTCOME_3 =
		"(jadscAppliPreInitiation.outcome IS NULL OR jadscAppliPreInitiation.outcome = '')";

	public JadscAppliPreInitiationPersistenceImpl() {
		setModelClass(JadscAppliPreInitiation.class);

		setModelImplClass(JadscAppliPreInitiationImpl.class);
		setModelPKClass(long.class);

		setTable(JadscAppliPreInitiationTable.INSTANCE);
	}

	/**
	 * Caches the jadsc appli pre initiation in the entity cache if it is enabled.
	 *
	 * @param jadscAppliPreInitiation the jadsc appli pre initiation
	 */
	@Override
	public void cacheResult(JadscAppliPreInitiation jadscAppliPreInitiation) {
		entityCache.putResult(
			JadscAppliPreInitiationImpl.class,
			jadscAppliPreInitiation.getPrimaryKey(), jadscAppliPreInitiation);

		finderCache.putResult(
			_finderPathFetchBygetJadsc_PI_CI,
			new Object[] {jadscAppliPreInitiation.getCaseId()},
			jadscAppliPreInitiation);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the jadsc appli pre initiations in the entity cache if it is enabled.
	 *
	 * @param jadscAppliPreInitiations the jadsc appli pre initiations
	 */
	@Override
	public void cacheResult(
		List<JadscAppliPreInitiation> jadscAppliPreInitiations) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (jadscAppliPreInitiations.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (JadscAppliPreInitiation jadscAppliPreInitiation :
				jadscAppliPreInitiations) {

			if (entityCache.getResult(
					JadscAppliPreInitiationImpl.class,
					jadscAppliPreInitiation.getPrimaryKey()) == null) {

				cacheResult(jadscAppliPreInitiation);
			}
		}
	}

	/**
	 * Clears the cache for all jadsc appli pre initiations.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(JadscAppliPreInitiationImpl.class);

		finderCache.clearCache(JadscAppliPreInitiationImpl.class);
	}

	/**
	 * Clears the cache for the jadsc appli pre initiation.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(JadscAppliPreInitiation jadscAppliPreInitiation) {
		entityCache.removeResult(
			JadscAppliPreInitiationImpl.class, jadscAppliPreInitiation);
	}

	@Override
	public void clearCache(
		List<JadscAppliPreInitiation> jadscAppliPreInitiations) {

		for (JadscAppliPreInitiation jadscAppliPreInitiation :
				jadscAppliPreInitiations) {

			entityCache.removeResult(
				JadscAppliPreInitiationImpl.class, jadscAppliPreInitiation);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(JadscAppliPreInitiationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				JadscAppliPreInitiationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		JadscAppliPreInitiationModelImpl jadscAppliPreInitiationModelImpl) {

		Object[] args = new Object[] {
			jadscAppliPreInitiationModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetJadsc_PI_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJadsc_PI_CI, args,
			jadscAppliPreInitiationModelImpl);
	}

	/**
	 * Creates a new jadsc appli pre initiation with the primary key. Does not add the jadsc appli pre initiation to the database.
	 *
	 * @param jadscAppliPreInitiationId the primary key for the new jadsc appli pre initiation
	 * @return the new jadsc appli pre initiation
	 */
	@Override
	public JadscAppliPreInitiation create(long jadscAppliPreInitiationId) {
		JadscAppliPreInitiation jadscAppliPreInitiation =
			new JadscAppliPreInitiationImpl();

		jadscAppliPreInitiation.setNew(true);
		jadscAppliPreInitiation.setPrimaryKey(jadscAppliPreInitiationId);

		jadscAppliPreInitiation.setCompanyId(CompanyThreadLocal.getCompanyId());

		return jadscAppliPreInitiation;
	}

	/**
	 * Removes the jadsc appli pre initiation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jadscAppliPreInitiationId the primary key of the jadsc appli pre initiation
	 * @return the jadsc appli pre initiation that was removed
	 * @throws NoSuchJadscAppliPreInitiationException if a jadsc appli pre initiation with the primary key could not be found
	 */
	@Override
	public JadscAppliPreInitiation remove(long jadscAppliPreInitiationId)
		throws NoSuchJadscAppliPreInitiationException {

		return remove((Serializable)jadscAppliPreInitiationId);
	}

	/**
	 * Removes the jadsc appli pre initiation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the jadsc appli pre initiation
	 * @return the jadsc appli pre initiation that was removed
	 * @throws NoSuchJadscAppliPreInitiationException if a jadsc appli pre initiation with the primary key could not be found
	 */
	@Override
	public JadscAppliPreInitiation remove(Serializable primaryKey)
		throws NoSuchJadscAppliPreInitiationException {

		Session session = null;

		try {
			session = openSession();

			JadscAppliPreInitiation jadscAppliPreInitiation =
				(JadscAppliPreInitiation)session.get(
					JadscAppliPreInitiationImpl.class, primaryKey);

			if (jadscAppliPreInitiation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJadscAppliPreInitiationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(jadscAppliPreInitiation);
		}
		catch (NoSuchJadscAppliPreInitiationException noSuchEntityException) {
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
	protected JadscAppliPreInitiation removeImpl(
		JadscAppliPreInitiation jadscAppliPreInitiation) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(jadscAppliPreInitiation)) {
				jadscAppliPreInitiation = (JadscAppliPreInitiation)session.get(
					JadscAppliPreInitiationImpl.class,
					jadscAppliPreInitiation.getPrimaryKeyObj());
			}

			if (jadscAppliPreInitiation != null) {
				session.delete(jadscAppliPreInitiation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (jadscAppliPreInitiation != null) {
			clearCache(jadscAppliPreInitiation);
		}

		return jadscAppliPreInitiation;
	}

	@Override
	public JadscAppliPreInitiation updateImpl(
		JadscAppliPreInitiation jadscAppliPreInitiation) {

		boolean isNew = jadscAppliPreInitiation.isNew();

		if (!(jadscAppliPreInitiation instanceof
				JadscAppliPreInitiationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(jadscAppliPreInitiation.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					jadscAppliPreInitiation);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in jadscAppliPreInitiation proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom JadscAppliPreInitiation implementation " +
					jadscAppliPreInitiation.getClass());
		}

		JadscAppliPreInitiationModelImpl jadscAppliPreInitiationModelImpl =
			(JadscAppliPreInitiationModelImpl)jadscAppliPreInitiation;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (jadscAppliPreInitiation.getCreateDate() == null)) {
			if (serviceContext == null) {
				jadscAppliPreInitiation.setCreateDate(date);
			}
			else {
				jadscAppliPreInitiation.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!jadscAppliPreInitiationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				jadscAppliPreInitiation.setModifiedDate(date);
			}
			else {
				jadscAppliPreInitiation.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(jadscAppliPreInitiation);
			}
			else {
				jadscAppliPreInitiation =
					(JadscAppliPreInitiation)session.merge(
						jadscAppliPreInitiation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			JadscAppliPreInitiationImpl.class, jadscAppliPreInitiationModelImpl,
			false, true);

		cacheUniqueFindersCache(jadscAppliPreInitiationModelImpl);

		if (isNew) {
			jadscAppliPreInitiation.setNew(false);
		}

		jadscAppliPreInitiation.resetOriginalValues();

		return jadscAppliPreInitiation;
	}

	/**
	 * Returns the jadsc appli pre initiation with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the jadsc appli pre initiation
	 * @return the jadsc appli pre initiation
	 * @throws NoSuchJadscAppliPreInitiationException if a jadsc appli pre initiation with the primary key could not be found
	 */
	@Override
	public JadscAppliPreInitiation findByPrimaryKey(Serializable primaryKey)
		throws NoSuchJadscAppliPreInitiationException {

		JadscAppliPreInitiation jadscAppliPreInitiation = fetchByPrimaryKey(
			primaryKey);

		if (jadscAppliPreInitiation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJadscAppliPreInitiationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return jadscAppliPreInitiation;
	}

	/**
	 * Returns the jadsc appli pre initiation with the primary key or throws a <code>NoSuchJadscAppliPreInitiationException</code> if it could not be found.
	 *
	 * @param jadscAppliPreInitiationId the primary key of the jadsc appli pre initiation
	 * @return the jadsc appli pre initiation
	 * @throws NoSuchJadscAppliPreInitiationException if a jadsc appli pre initiation with the primary key could not be found
	 */
	@Override
	public JadscAppliPreInitiation findByPrimaryKey(
			long jadscAppliPreInitiationId)
		throws NoSuchJadscAppliPreInitiationException {

		return findByPrimaryKey((Serializable)jadscAppliPreInitiationId);
	}

	/**
	 * Returns the jadsc appli pre initiation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jadscAppliPreInitiationId the primary key of the jadsc appli pre initiation
	 * @return the jadsc appli pre initiation, or <code>null</code> if a jadsc appli pre initiation with the primary key could not be found
	 */
	@Override
	public JadscAppliPreInitiation fetchByPrimaryKey(
		long jadscAppliPreInitiationId) {

		return fetchByPrimaryKey((Serializable)jadscAppliPreInitiationId);
	}

	/**
	 * Returns all the jadsc appli pre initiations.
	 *
	 * @return the jadsc appli pre initiations
	 */
	@Override
	public List<JadscAppliPreInitiation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc appli pre initiations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliPreInitiationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc appli pre initiations
	 * @param end the upper bound of the range of jadsc appli pre initiations (not inclusive)
	 * @return the range of jadsc appli pre initiations
	 */
	@Override
	public List<JadscAppliPreInitiation> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc appli pre initiations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliPreInitiationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc appli pre initiations
	 * @param end the upper bound of the range of jadsc appli pre initiations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc appli pre initiations
	 */
	@Override
	public List<JadscAppliPreInitiation> findAll(
		int start, int end,
		OrderByComparator<JadscAppliPreInitiation> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc appli pre initiations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliPreInitiationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc appli pre initiations
	 * @param end the upper bound of the range of jadsc appli pre initiations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc appli pre initiations
	 */
	@Override
	public List<JadscAppliPreInitiation> findAll(
		int start, int end,
		OrderByComparator<JadscAppliPreInitiation> orderByComparator,
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

		List<JadscAppliPreInitiation> list = null;

		if (useFinderCache) {
			list = (List<JadscAppliPreInitiation>)finderCache.getResult(
				finderPath, finderArgs,this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_JADSCAPPLIPREINITIATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_JADSCAPPLIPREINITIATION;

				sql = sql.concat(
					JadscAppliPreInitiationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<JadscAppliPreInitiation>)QueryUtil.list(
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
	 * Removes all the jadsc appli pre initiations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (JadscAppliPreInitiation jadscAppliPreInitiation : findAll()) {
			remove(jadscAppliPreInitiation);
		}
	}

	/**
	 * Returns the number of jadsc appli pre initiations.
	 *
	 * @return the number of jadsc appli pre initiations
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
					_SQL_COUNT_JADSCAPPLIPREINITIATION);

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
		return "jadscAppliPreInitiationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_JADSCAPPLIPREINITIATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return JadscAppliPreInitiationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the jadsc appli pre initiation persistence.
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

		_finderPathFetchBygetJadsc_PI_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJadsc_PI_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetJadsc_PI_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetJadsc_PI_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetJadsc_By_PI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetJadsc_By_PI",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"outcome"}, true);

		_finderPathWithoutPaginationFindBygetJadsc_By_PI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetJadsc_By_PI",
			new String[] {String.class.getName()}, new String[] {"outcome"},
			true);

		_finderPathCountBygetJadsc_By_PI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetJadsc_By_PI",
			new String[] {String.class.getName()}, new String[] {"outcome"},
			false);

		_setJadscAppliPreInitiationUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setJadscAppliPreInitiationUtilPersistence(null);

		entityCache.removeCache(JadscAppliPreInitiationImpl.class.getName());
	}

	private void _setJadscAppliPreInitiationUtilPersistence(
		JadscAppliPreInitiationPersistence jadscAppliPreInitiationPersistence) {

		try {
			Field field = JadscAppliPreInitiationUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, jadscAppliPreInitiationPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = JADSC_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JADSC_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JADSC_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_JADSCAPPLIPREINITIATION =
		"SELECT jadscAppliPreInitiation FROM JadscAppliPreInitiation jadscAppliPreInitiation";

	private static final String _SQL_SELECT_JADSCAPPLIPREINITIATION_WHERE =
		"SELECT jadscAppliPreInitiation FROM JadscAppliPreInitiation jadscAppliPreInitiation WHERE ";

	private static final String _SQL_COUNT_JADSCAPPLIPREINITIATION =
		"SELECT COUNT(jadscAppliPreInitiation) FROM JadscAppliPreInitiation jadscAppliPreInitiation";

	private static final String _SQL_COUNT_JADSCAPPLIPREINITIATION_WHERE =
		"SELECT COUNT(jadscAppliPreInitiation) FROM JadscAppliPreInitiation jadscAppliPreInitiation WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"jadscAppliPreInitiation.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No JadscAppliPreInitiation exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No JadscAppliPreInitiation exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		JadscAppliPreInitiationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private JadscAppliPreInitiationModelArgumentsResolver
		_jadscAppliPreInitiationModelArgumentsResolver;

}