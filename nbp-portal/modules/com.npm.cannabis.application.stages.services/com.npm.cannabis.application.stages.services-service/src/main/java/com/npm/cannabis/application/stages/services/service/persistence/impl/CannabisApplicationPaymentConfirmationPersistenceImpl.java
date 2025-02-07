/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service.persistence.impl;

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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.npm.cannabis.application.stages.services.exception.NoSuchCannabisApplicationPaymentConfirmationException;
import com.npm.cannabis.application.stages.services.model.CannabisApplicationPaymentConfirmation;
import com.npm.cannabis.application.stages.services.model.CannabisApplicationPaymentConfirmationTable;
import com.npm.cannabis.application.stages.services.model.impl.CannabisApplicationPaymentConfirmationImpl;
import com.npm.cannabis.application.stages.services.model.impl.CannabisApplicationPaymentConfirmationModelImpl;
import com.npm.cannabis.application.stages.services.service.persistence.CannabisApplicationPaymentConfirmationPersistence;
import com.npm.cannabis.application.stages.services.service.persistence.CannabisApplicationPaymentConfirmationUtil;
import com.npm.cannabis.application.stages.services.service.persistence.impl.constants.CANNABIS_STAGESPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
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
 * The persistence implementation for the cannabis application payment confirmation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CannabisApplicationPaymentConfirmationPersistence.class)
public class CannabisApplicationPaymentConfirmationPersistenceImpl
	extends BasePersistenceImpl<CannabisApplicationPaymentConfirmation>
	implements CannabisApplicationPaymentConfirmationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CannabisApplicationPaymentConfirmationUtil</code> to access the cannabis application payment confirmation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CannabisApplicationPaymentConfirmationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetCannabisPaymentByCaseId;
	private FinderPath _finderPathCountBygetCannabisPaymentByCaseId;

	/**
	 * Returns the cannabis application payment confirmation where caseId = &#63; or throws a <code>NoSuchCannabisApplicationPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis application payment confirmation
	 * @throws NoSuchCannabisApplicationPaymentConfirmationException if a matching cannabis application payment confirmation could not be found
	 */
	@Override
	public CannabisApplicationPaymentConfirmation
			findBygetCannabisPaymentByCaseId(String caseId)
		throws NoSuchCannabisApplicationPaymentConfirmationException {

		CannabisApplicationPaymentConfirmation
			cannabisApplicationPaymentConfirmation =
				fetchBygetCannabisPaymentByCaseId(caseId);

		if (cannabisApplicationPaymentConfirmation == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCannabisApplicationPaymentConfirmationException(
				sb.toString());
		}

		return cannabisApplicationPaymentConfirmation;
	}

	/**
	 * Returns the cannabis application payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis application payment confirmation, or <code>null</code> if a matching cannabis application payment confirmation could not be found
	 */
	@Override
	public CannabisApplicationPaymentConfirmation
		fetchBygetCannabisPaymentByCaseId(String caseId) {

		return fetchBygetCannabisPaymentByCaseId(caseId, true);
	}

	/**
	 * Returns the cannabis application payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application payment confirmation, or <code>null</code> if a matching cannabis application payment confirmation could not be found
	 */
	@Override
	public CannabisApplicationPaymentConfirmation
		fetchBygetCannabisPaymentByCaseId(
			String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetCannabisPaymentByCaseId, finderArgs, this);
		}

		if (result instanceof CannabisApplicationPaymentConfirmation) {
			CannabisApplicationPaymentConfirmation
				cannabisApplicationPaymentConfirmation =
					(CannabisApplicationPaymentConfirmation)result;

			if (!Objects.equals(
					caseId,
					cannabisApplicationPaymentConfirmation.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_CANNABISAPPLICATIONPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCANNABISPAYMENTBYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCANNABISPAYMENTBYCASEID_CASEID_2);
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

				List<CannabisApplicationPaymentConfirmation> list =
					query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetCannabisPaymentByCaseId,
							finderArgs, list);
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
								"CannabisApplicationPaymentConfirmationPersistenceImpl.fetchBygetCannabisPaymentByCaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CannabisApplicationPaymentConfirmation
						cannabisApplicationPaymentConfirmation = list.get(0);

					result = cannabisApplicationPaymentConfirmation;

					cacheResult(cannabisApplicationPaymentConfirmation);
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
			return (CannabisApplicationPaymentConfirmation)result;
		}
	}

	/**
	 * Removes the cannabis application payment confirmation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the cannabis application payment confirmation that was removed
	 */
	@Override
	public CannabisApplicationPaymentConfirmation
			removeBygetCannabisPaymentByCaseId(String caseId)
		throws NoSuchCannabisApplicationPaymentConfirmationException {

		CannabisApplicationPaymentConfirmation
			cannabisApplicationPaymentConfirmation =
				findBygetCannabisPaymentByCaseId(caseId);

		return remove(cannabisApplicationPaymentConfirmation);
	}

	/**
	 * Returns the number of cannabis application payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching cannabis application payment confirmations
	 */
	@Override
	public int countBygetCannabisPaymentByCaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetCannabisPaymentByCaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISAPPLICATIONPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCANNABISPAYMENTBYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCANNABISPAYMENTBYCASEID_CASEID_2);
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

	private static final String
		_FINDER_COLUMN_GETCANNABISPAYMENTBYCASEID_CASEID_2 =
			"cannabisApplicationPaymentConfirmation.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETCANNABISPAYMENTBYCASEID_CASEID_3 =
			"(cannabisApplicationPaymentConfirmation.caseId IS NULL OR cannabisApplicationPaymentConfirmation.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetCA_PC_By_CI;
	private FinderPath _finderPathWithoutPaginationFindBygetCA_PC_By_CI;
	private FinderPath _finderPathCountBygetCA_PC_By_CI;

	/**
	 * Returns all the cannabis application payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis application payment confirmations
	 */
	@Override
	public List<CannabisApplicationPaymentConfirmation> findBygetCA_PC_By_CI(
		String caseId) {

		return findBygetCA_PC_By_CI(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis application payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis application payment confirmations
	 * @param end the upper bound of the range of cannabis application payment confirmations (not inclusive)
	 * @return the range of matching cannabis application payment confirmations
	 */
	@Override
	public List<CannabisApplicationPaymentConfirmation> findBygetCA_PC_By_CI(
		String caseId, int start, int end) {

		return findBygetCA_PC_By_CI(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis application payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis application payment confirmations
	 * @param end the upper bound of the range of cannabis application payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application payment confirmations
	 */
	@Override
	public List<CannabisApplicationPaymentConfirmation> findBygetCA_PC_By_CI(
		String caseId, int start, int end,
		OrderByComparator<CannabisApplicationPaymentConfirmation>
			orderByComparator) {

		return findBygetCA_PC_By_CI(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis application payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis application payment confirmations
	 * @param end the upper bound of the range of cannabis application payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application payment confirmations
	 */
	@Override
	public List<CannabisApplicationPaymentConfirmation> findBygetCA_PC_By_CI(
		String caseId, int start, int end,
		OrderByComparator<CannabisApplicationPaymentConfirmation>
			orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetCA_PC_By_CI;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetCA_PC_By_CI;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<CannabisApplicationPaymentConfirmation> list = null;

		if (useFinderCache) {
			list =
				(List<CannabisApplicationPaymentConfirmation>)
					finderCache.getResult(finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisApplicationPaymentConfirmation
						cannabisApplicationPaymentConfirmation : list) {

					if (!caseId.equals(
							cannabisApplicationPaymentConfirmation.
								getCaseId())) {

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

			sb.append(_SQL_SELECT_CANNABISAPPLICATIONPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCA_PC_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCA_PC_BY_CI_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(
					CannabisApplicationPaymentConfirmationModelImpl.
						ORDER_BY_JPQL);
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

				list =
					(List<CannabisApplicationPaymentConfirmation>)
						QueryUtil.list(query, getDialect(), start, end);

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
	 * Returns the first cannabis application payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application payment confirmation
	 * @throws NoSuchCannabisApplicationPaymentConfirmationException if a matching cannabis application payment confirmation could not be found
	 */
	@Override
	public CannabisApplicationPaymentConfirmation findBygetCA_PC_By_CI_First(
			String caseId,
			OrderByComparator<CannabisApplicationPaymentConfirmation>
				orderByComparator)
		throws NoSuchCannabisApplicationPaymentConfirmationException {

		CannabisApplicationPaymentConfirmation
			cannabisApplicationPaymentConfirmation =
				fetchBygetCA_PC_By_CI_First(caseId, orderByComparator);

		if (cannabisApplicationPaymentConfirmation != null) {
			return cannabisApplicationPaymentConfirmation;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchCannabisApplicationPaymentConfirmationException(
			sb.toString());
	}

	/**
	 * Returns the first cannabis application payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application payment confirmation, or <code>null</code> if a matching cannabis application payment confirmation could not be found
	 */
	@Override
	public CannabisApplicationPaymentConfirmation fetchBygetCA_PC_By_CI_First(
		String caseId,
		OrderByComparator<CannabisApplicationPaymentConfirmation>
			orderByComparator) {

		List<CannabisApplicationPaymentConfirmation> list =
			findBygetCA_PC_By_CI(caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis application payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application payment confirmation
	 * @throws NoSuchCannabisApplicationPaymentConfirmationException if a matching cannabis application payment confirmation could not be found
	 */
	@Override
	public CannabisApplicationPaymentConfirmation findBygetCA_PC_By_CI_Last(
			String caseId,
			OrderByComparator<CannabisApplicationPaymentConfirmation>
				orderByComparator)
		throws NoSuchCannabisApplicationPaymentConfirmationException {

		CannabisApplicationPaymentConfirmation
			cannabisApplicationPaymentConfirmation = fetchBygetCA_PC_By_CI_Last(
				caseId, orderByComparator);

		if (cannabisApplicationPaymentConfirmation != null) {
			return cannabisApplicationPaymentConfirmation;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchCannabisApplicationPaymentConfirmationException(
			sb.toString());
	}

	/**
	 * Returns the last cannabis application payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application payment confirmation, or <code>null</code> if a matching cannabis application payment confirmation could not be found
	 */
	@Override
	public CannabisApplicationPaymentConfirmation fetchBygetCA_PC_By_CI_Last(
		String caseId,
		OrderByComparator<CannabisApplicationPaymentConfirmation>
			orderByComparator) {

		int count = countBygetCA_PC_By_CI(caseId);

		if (count == 0) {
			return null;
		}

		List<CannabisApplicationPaymentConfirmation> list =
			findBygetCA_PC_By_CI(caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis application payment confirmations before and after the current cannabis application payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param cannabisAppliPaymentConfirId the primary key of the current cannabis application payment confirmation
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application payment confirmation
	 * @throws NoSuchCannabisApplicationPaymentConfirmationException if a cannabis application payment confirmation with the primary key could not be found
	 */
	@Override
	public CannabisApplicationPaymentConfirmation[]
			findBygetCA_PC_By_CI_PrevAndNext(
				long cannabisAppliPaymentConfirId, String caseId,
				OrderByComparator<CannabisApplicationPaymentConfirmation>
					orderByComparator)
		throws NoSuchCannabisApplicationPaymentConfirmationException {

		caseId = Objects.toString(caseId, "");

		CannabisApplicationPaymentConfirmation
			cannabisApplicationPaymentConfirmation = findByPrimaryKey(
				cannabisAppliPaymentConfirId);

		Session session = null;

		try {
			session = openSession();

			CannabisApplicationPaymentConfirmation[] array =
				new CannabisApplicationPaymentConfirmationImpl[3];

			array[0] = getBygetCA_PC_By_CI_PrevAndNext(
				session, cannabisApplicationPaymentConfirmation, caseId,
				orderByComparator, true);

			array[1] = cannabisApplicationPaymentConfirmation;

			array[2] = getBygetCA_PC_By_CI_PrevAndNext(
				session, cannabisApplicationPaymentConfirmation, caseId,
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

	protected CannabisApplicationPaymentConfirmation
		getBygetCA_PC_By_CI_PrevAndNext(
			Session session,
			CannabisApplicationPaymentConfirmation
				cannabisApplicationPaymentConfirmation,
			String caseId,
			OrderByComparator<CannabisApplicationPaymentConfirmation>
				orderByComparator,
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

		sb.append(_SQL_SELECT_CANNABISAPPLICATIONPAYMENTCONFIRMATION_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETCA_PC_BY_CI_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETCA_PC_BY_CI_CASEID_2);
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
			sb.append(
				CannabisApplicationPaymentConfirmationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindCaseId) {
			queryPos.add(caseId);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						cannabisApplicationPaymentConfirmation)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisApplicationPaymentConfirmation> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis application payment confirmations where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetCA_PC_By_CI(String caseId) {
		for (CannabisApplicationPaymentConfirmation
				cannabisApplicationPaymentConfirmation :
					findBygetCA_PC_By_CI(
						caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(cannabisApplicationPaymentConfirmation);
		}
	}

	/**
	 * Returns the number of cannabis application payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching cannabis application payment confirmations
	 */
	@Override
	public int countBygetCA_PC_By_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetCA_PC_By_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISAPPLICATIONPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCA_PC_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCA_PC_BY_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETCA_PC_BY_CI_CASEID_2 =
		"cannabisApplicationPaymentConfirmation.caseId = ?";

	private static final String _FINDER_COLUMN_GETCA_PC_BY_CI_CASEID_3 =
		"(cannabisApplicationPaymentConfirmation.caseId IS NULL OR cannabisApplicationPaymentConfirmation.caseId = '')";

	public CannabisApplicationPaymentConfirmationPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("comment", "comment_");

		setDBColumnNames(dbColumnNames);

		setModelClass(CannabisApplicationPaymentConfirmation.class);

		setModelImplClass(CannabisApplicationPaymentConfirmationImpl.class);
		setModelPKClass(long.class);

		setTable(CannabisApplicationPaymentConfirmationTable.INSTANCE);
	}

	/**
	 * Caches the cannabis application payment confirmation in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationPaymentConfirmation the cannabis application payment confirmation
	 */
	@Override
	public void cacheResult(
		CannabisApplicationPaymentConfirmation
			cannabisApplicationPaymentConfirmation) {

		entityCache.putResult(
			CannabisApplicationPaymentConfirmationImpl.class,
			cannabisApplicationPaymentConfirmation.getPrimaryKey(),
			cannabisApplicationPaymentConfirmation);

		finderCache.putResult(
			_finderPathFetchBygetCannabisPaymentByCaseId,
			new Object[] {cannabisApplicationPaymentConfirmation.getCaseId()},
			cannabisApplicationPaymentConfirmation);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the cannabis application payment confirmations in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationPaymentConfirmations the cannabis application payment confirmations
	 */
	@Override
	public void cacheResult(
		List<CannabisApplicationPaymentConfirmation>
			cannabisApplicationPaymentConfirmations) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (cannabisApplicationPaymentConfirmations.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CannabisApplicationPaymentConfirmation
				cannabisApplicationPaymentConfirmation :
					cannabisApplicationPaymentConfirmations) {

			if (entityCache.getResult(
					CannabisApplicationPaymentConfirmationImpl.class,
					cannabisApplicationPaymentConfirmation.getPrimaryKey()) ==
						null) {

				cacheResult(cannabisApplicationPaymentConfirmation);
			}
		}
	}

	/**
	 * Clears the cache for all cannabis application payment confirmations.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(
			CannabisApplicationPaymentConfirmationImpl.class);

		finderCache.clearCache(
			CannabisApplicationPaymentConfirmationImpl.class);
	}

	/**
	 * Clears the cache for the cannabis application payment confirmation.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		CannabisApplicationPaymentConfirmation
			cannabisApplicationPaymentConfirmation) {

		entityCache.removeResult(
			CannabisApplicationPaymentConfirmationImpl.class,
			cannabisApplicationPaymentConfirmation);
	}

	@Override
	public void clearCache(
		List<CannabisApplicationPaymentConfirmation>
			cannabisApplicationPaymentConfirmations) {

		for (CannabisApplicationPaymentConfirmation
				cannabisApplicationPaymentConfirmation :
					cannabisApplicationPaymentConfirmations) {

			entityCache.removeResult(
				CannabisApplicationPaymentConfirmationImpl.class,
				cannabisApplicationPaymentConfirmation);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(
			CannabisApplicationPaymentConfirmationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				CannabisApplicationPaymentConfirmationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		CannabisApplicationPaymentConfirmationModelImpl
			cannabisApplicationPaymentConfirmationModelImpl) {

		Object[] args = new Object[] {
			cannabisApplicationPaymentConfirmationModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetCannabisPaymentByCaseId, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetCannabisPaymentByCaseId, args,
			cannabisApplicationPaymentConfirmationModelImpl);
	}

	/**
	 * Creates a new cannabis application payment confirmation with the primary key. Does not add the cannabis application payment confirmation to the database.
	 *
	 * @param cannabisAppliPaymentConfirId the primary key for the new cannabis application payment confirmation
	 * @return the new cannabis application payment confirmation
	 */
	@Override
	public CannabisApplicationPaymentConfirmation create(
		long cannabisAppliPaymentConfirId) {

		CannabisApplicationPaymentConfirmation
			cannabisApplicationPaymentConfirmation =
				new CannabisApplicationPaymentConfirmationImpl();

		cannabisApplicationPaymentConfirmation.setNew(true);
		cannabisApplicationPaymentConfirmation.setPrimaryKey(
			cannabisAppliPaymentConfirId);

		cannabisApplicationPaymentConfirmation.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return cannabisApplicationPaymentConfirmation;
	}

	/**
	 * Removes the cannabis application payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisAppliPaymentConfirId the primary key of the cannabis application payment confirmation
	 * @return the cannabis application payment confirmation that was removed
	 * @throws NoSuchCannabisApplicationPaymentConfirmationException if a cannabis application payment confirmation with the primary key could not be found
	 */
	@Override
	public CannabisApplicationPaymentConfirmation remove(
			long cannabisAppliPaymentConfirId)
		throws NoSuchCannabisApplicationPaymentConfirmationException {

		return remove((Serializable)cannabisAppliPaymentConfirId);
	}

	/**
	 * Removes the cannabis application payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cannabis application payment confirmation
	 * @return the cannabis application payment confirmation that was removed
	 * @throws NoSuchCannabisApplicationPaymentConfirmationException if a cannabis application payment confirmation with the primary key could not be found
	 */
	@Override
	public CannabisApplicationPaymentConfirmation remove(
			Serializable primaryKey)
		throws NoSuchCannabisApplicationPaymentConfirmationException {

		Session session = null;

		try {
			session = openSession();

			CannabisApplicationPaymentConfirmation
				cannabisApplicationPaymentConfirmation =
					(CannabisApplicationPaymentConfirmation)session.get(
						CannabisApplicationPaymentConfirmationImpl.class,
						primaryKey);

			if (cannabisApplicationPaymentConfirmation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCannabisApplicationPaymentConfirmationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(cannabisApplicationPaymentConfirmation);
		}
		catch (NoSuchCannabisApplicationPaymentConfirmationException
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
	protected CannabisApplicationPaymentConfirmation removeImpl(
		CannabisApplicationPaymentConfirmation
			cannabisApplicationPaymentConfirmation) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cannabisApplicationPaymentConfirmation)) {
				cannabisApplicationPaymentConfirmation =
					(CannabisApplicationPaymentConfirmation)session.get(
						CannabisApplicationPaymentConfirmationImpl.class,
						cannabisApplicationPaymentConfirmation.
							getPrimaryKeyObj());
			}

			if (cannabisApplicationPaymentConfirmation != null) {
				session.delete(cannabisApplicationPaymentConfirmation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (cannabisApplicationPaymentConfirmation != null) {
			clearCache(cannabisApplicationPaymentConfirmation);
		}

		return cannabisApplicationPaymentConfirmation;
	}

	@Override
	public CannabisApplicationPaymentConfirmation updateImpl(
		CannabisApplicationPaymentConfirmation
			cannabisApplicationPaymentConfirmation) {

		boolean isNew = cannabisApplicationPaymentConfirmation.isNew();

		if (!(cannabisApplicationPaymentConfirmation instanceof
				CannabisApplicationPaymentConfirmationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					cannabisApplicationPaymentConfirmation.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					cannabisApplicationPaymentConfirmation);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in cannabisApplicationPaymentConfirmation proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CannabisApplicationPaymentConfirmation implementation " +
					cannabisApplicationPaymentConfirmation.getClass());
		}

		CannabisApplicationPaymentConfirmationModelImpl
			cannabisApplicationPaymentConfirmationModelImpl =
				(CannabisApplicationPaymentConfirmationModelImpl)
					cannabisApplicationPaymentConfirmation;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(cannabisApplicationPaymentConfirmation.getCreateDate() == null)) {

			if (serviceContext == null) {
				cannabisApplicationPaymentConfirmation.setCreateDate(date);
			}
			else {
				cannabisApplicationPaymentConfirmation.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!cannabisApplicationPaymentConfirmationModelImpl.
				hasSetModifiedDate()) {

			if (serviceContext == null) {
				cannabisApplicationPaymentConfirmation.setModifiedDate(date);
			}
			else {
				cannabisApplicationPaymentConfirmation.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(cannabisApplicationPaymentConfirmation);
			}
			else {
				cannabisApplicationPaymentConfirmation =
					(CannabisApplicationPaymentConfirmation)session.merge(
						cannabisApplicationPaymentConfirmation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CannabisApplicationPaymentConfirmationImpl.class,
			cannabisApplicationPaymentConfirmationModelImpl, false, true);

		cacheUniqueFindersCache(
			cannabisApplicationPaymentConfirmationModelImpl);

		if (isNew) {
			cannabisApplicationPaymentConfirmation.setNew(false);
		}

		cannabisApplicationPaymentConfirmation.resetOriginalValues();

		return cannabisApplicationPaymentConfirmation;
	}

	/**
	 * Returns the cannabis application payment confirmation with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cannabis application payment confirmation
	 * @return the cannabis application payment confirmation
	 * @throws NoSuchCannabisApplicationPaymentConfirmationException if a cannabis application payment confirmation with the primary key could not be found
	 */
	@Override
	public CannabisApplicationPaymentConfirmation findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchCannabisApplicationPaymentConfirmationException {

		CannabisApplicationPaymentConfirmation
			cannabisApplicationPaymentConfirmation = fetchByPrimaryKey(
				primaryKey);

		if (cannabisApplicationPaymentConfirmation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCannabisApplicationPaymentConfirmationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return cannabisApplicationPaymentConfirmation;
	}

	/**
	 * Returns the cannabis application payment confirmation with the primary key or throws a <code>NoSuchCannabisApplicationPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param cannabisAppliPaymentConfirId the primary key of the cannabis application payment confirmation
	 * @return the cannabis application payment confirmation
	 * @throws NoSuchCannabisApplicationPaymentConfirmationException if a cannabis application payment confirmation with the primary key could not be found
	 */
	@Override
	public CannabisApplicationPaymentConfirmation findByPrimaryKey(
			long cannabisAppliPaymentConfirId)
		throws NoSuchCannabisApplicationPaymentConfirmationException {

		return findByPrimaryKey((Serializable)cannabisAppliPaymentConfirId);
	}

	/**
	 * Returns the cannabis application payment confirmation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisAppliPaymentConfirId the primary key of the cannabis application payment confirmation
	 * @return the cannabis application payment confirmation, or <code>null</code> if a cannabis application payment confirmation with the primary key could not be found
	 */
	@Override
	public CannabisApplicationPaymentConfirmation fetchByPrimaryKey(
		long cannabisAppliPaymentConfirId) {

		return fetchByPrimaryKey((Serializable)cannabisAppliPaymentConfirId);
	}

	/**
	 * Returns all the cannabis application payment confirmations.
	 *
	 * @return the cannabis application payment confirmations
	 */
	@Override
	public List<CannabisApplicationPaymentConfirmation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis application payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application payment confirmations
	 * @param end the upper bound of the range of cannabis application payment confirmations (not inclusive)
	 * @return the range of cannabis application payment confirmations
	 */
	@Override
	public List<CannabisApplicationPaymentConfirmation> findAll(
		int start, int end) {

		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis application payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application payment confirmations
	 * @param end the upper bound of the range of cannabis application payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis application payment confirmations
	 */
	@Override
	public List<CannabisApplicationPaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<CannabisApplicationPaymentConfirmation>
			orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis application payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application payment confirmations
	 * @param end the upper bound of the range of cannabis application payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis application payment confirmations
	 */
	@Override
	public List<CannabisApplicationPaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<CannabisApplicationPaymentConfirmation>
			orderByComparator,
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

		List<CannabisApplicationPaymentConfirmation> list = null;

		if (useFinderCache) {
			list =
				(List<CannabisApplicationPaymentConfirmation>)
					finderCache.getResult(finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CANNABISAPPLICATIONPAYMENTCONFIRMATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CANNABISAPPLICATIONPAYMENTCONFIRMATION;

				sql = sql.concat(
					CannabisApplicationPaymentConfirmationModelImpl.
						ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list =
					(List<CannabisApplicationPaymentConfirmation>)
						QueryUtil.list(query, getDialect(), start, end);

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
	 * Removes all the cannabis application payment confirmations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CannabisApplicationPaymentConfirmation
				cannabisApplicationPaymentConfirmation : findAll()) {

			remove(cannabisApplicationPaymentConfirmation);
		}
	}

	/**
	 * Returns the number of cannabis application payment confirmations.
	 *
	 * @return the number of cannabis application payment confirmations
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
					_SQL_COUNT_CANNABISAPPLICATIONPAYMENTCONFIRMATION);

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
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "cannabisAppliPaymentConfirId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CANNABISAPPLICATIONPAYMENTCONFIRMATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CannabisApplicationPaymentConfirmationModelImpl.
			TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the cannabis application payment confirmation persistence.
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

		_finderPathFetchBygetCannabisPaymentByCaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetCannabisPaymentByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetCannabisPaymentByCaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetCannabisPaymentByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetCA_PC_By_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetCA_PC_By_CI",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetCA_PC_By_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetCA_PC_By_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetCA_PC_By_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetCA_PC_By_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		CannabisApplicationPaymentConfirmationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CannabisApplicationPaymentConfirmationUtil.setPersistence(null);

		entityCache.removeCache(
			CannabisApplicationPaymentConfirmationImpl.class.getName());
	}

	@Override
	@Reference(
		target = CANNABIS_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = CANNABIS_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = CANNABIS_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String
		_SQL_SELECT_CANNABISAPPLICATIONPAYMENTCONFIRMATION =
			"SELECT cannabisApplicationPaymentConfirmation FROM CannabisApplicationPaymentConfirmation cannabisApplicationPaymentConfirmation";

	private static final String
		_SQL_SELECT_CANNABISAPPLICATIONPAYMENTCONFIRMATION_WHERE =
			"SELECT cannabisApplicationPaymentConfirmation FROM CannabisApplicationPaymentConfirmation cannabisApplicationPaymentConfirmation WHERE ";

	private static final String
		_SQL_COUNT_CANNABISAPPLICATIONPAYMENTCONFIRMATION =
			"SELECT COUNT(cannabisApplicationPaymentConfirmation) FROM CannabisApplicationPaymentConfirmation cannabisApplicationPaymentConfirmation";

	private static final String
		_SQL_COUNT_CANNABISAPPLICATIONPAYMENTCONFIRMATION_WHERE =
			"SELECT COUNT(cannabisApplicationPaymentConfirmation) FROM CannabisApplicationPaymentConfirmation cannabisApplicationPaymentConfirmation WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"cannabisApplicationPaymentConfirmation.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CannabisApplicationPaymentConfirmation exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CannabisApplicationPaymentConfirmation exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CannabisApplicationPaymentConfirmationPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"comment"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}