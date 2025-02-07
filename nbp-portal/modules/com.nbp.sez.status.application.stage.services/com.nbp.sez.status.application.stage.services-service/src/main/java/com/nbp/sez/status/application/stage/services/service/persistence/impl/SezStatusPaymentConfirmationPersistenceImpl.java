/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service.persistence.impl;

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

import com.nbp.sez.status.application.stage.services.exception.NoSuchSezStatusPaymentConfirmationException;
import com.nbp.sez.status.application.stage.services.model.SezStatusPaymentConfirmation;
import com.nbp.sez.status.application.stage.services.model.SezStatusPaymentConfirmationTable;
import com.nbp.sez.status.application.stage.services.model.impl.SezStatusPaymentConfirmationImpl;
import com.nbp.sez.status.application.stage.services.model.impl.SezStatusPaymentConfirmationModelImpl;
import com.nbp.sez.status.application.stage.services.service.persistence.SezStatusPaymentConfirmationPersistence;
import com.nbp.sez.status.application.stage.services.service.persistence.SezStatusPaymentConfirmationUtil;
import com.nbp.sez.status.application.stage.services.service.persistence.impl.constants.SEZ_STATUS_STAGESPersistenceConstants;

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
 * The persistence implementation for the sez status payment confirmation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezStatusPaymentConfirmationPersistence.class)
public class SezStatusPaymentConfirmationPersistenceImpl
	extends BasePersistenceImpl<SezStatusPaymentConfirmation>
	implements SezStatusPaymentConfirmationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezStatusPaymentConfirmationUtil</code> to access the sez status payment confirmation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezStatusPaymentConfirmationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetPaymentConfirmationBy_CI;
	private FinderPath _finderPathCountBygetPaymentConfirmationBy_CI;

	/**
	 * Returns the sez status payment confirmation where caseId = &#63; or throws a <code>NoSuchSezStatusPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status payment confirmation
	 * @throws NoSuchSezStatusPaymentConfirmationException if a matching sez status payment confirmation could not be found
	 */
	@Override
	public SezStatusPaymentConfirmation findBygetPaymentConfirmationBy_CI(
			String caseId)
		throws NoSuchSezStatusPaymentConfirmationException {

		SezStatusPaymentConfirmation sezStatusPaymentConfirmation =
			fetchBygetPaymentConfirmationBy_CI(caseId);

		if (sezStatusPaymentConfirmation == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchSezStatusPaymentConfirmationException(
				sb.toString());
		}

		return sezStatusPaymentConfirmation;
	}

	/**
	 * Returns the sez status payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status payment confirmation, or <code>null</code> if a matching sez status payment confirmation could not be found
	 */
	@Override
	public SezStatusPaymentConfirmation fetchBygetPaymentConfirmationBy_CI(
		String caseId) {

		return fetchBygetPaymentConfirmationBy_CI(caseId, true);
	}

	/**
	 * Returns the sez status payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status payment confirmation, or <code>null</code> if a matching sez status payment confirmation could not be found
	 */
	@Override
	public SezStatusPaymentConfirmation fetchBygetPaymentConfirmationBy_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetPaymentConfirmationBy_CI, finderArgs,
				this);
		}

		if (result instanceof SezStatusPaymentConfirmation) {
			SezStatusPaymentConfirmation sezStatusPaymentConfirmation =
				(SezStatusPaymentConfirmation)result;

			if (!Objects.equals(
					caseId, sezStatusPaymentConfirmation.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_SEZSTATUSPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPAYMENTCONFIRMATIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETPAYMENTCONFIRMATIONBY_CI_CASEID_2);
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

				List<SezStatusPaymentConfirmation> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetPaymentConfirmationBy_CI,
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
								"SezStatusPaymentConfirmationPersistenceImpl.fetchBygetPaymentConfirmationBy_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezStatusPaymentConfirmation sezStatusPaymentConfirmation =
						list.get(0);

					result = sezStatusPaymentConfirmation;

					cacheResult(sezStatusPaymentConfirmation);
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
			return (SezStatusPaymentConfirmation)result;
		}
	}

	/**
	 * Removes the sez status payment confirmation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the sez status payment confirmation that was removed
	 */
	@Override
	public SezStatusPaymentConfirmation removeBygetPaymentConfirmationBy_CI(
			String caseId)
		throws NoSuchSezStatusPaymentConfirmationException {

		SezStatusPaymentConfirmation sezStatusPaymentConfirmation =
			findBygetPaymentConfirmationBy_CI(caseId);

		return remove(sezStatusPaymentConfirmation);
	}

	/**
	 * Returns the number of sez status payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching sez status payment confirmations
	 */
	@Override
	public int countBygetPaymentConfirmationBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetPaymentConfirmationBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZSTATUSPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPAYMENTCONFIRMATIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETPAYMENTCONFIRMATIONBY_CI_CASEID_2);
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
		_FINDER_COLUMN_GETPAYMENTCONFIRMATIONBY_CI_CASEID_2 =
			"sezStatusPaymentConfirmation.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETPAYMENTCONFIRMATIONBY_CI_CASEID_3 =
			"(sezStatusPaymentConfirmation.caseId IS NULL OR sezStatusPaymentConfirmation.caseId = '')";

	private FinderPath
		_finderPathWithPaginationFindBygetPaymentConfirmation_By_CI;
	private FinderPath
		_finderPathWithoutPaginationFindBygetPaymentConfirmation_By_CI;
	private FinderPath _finderPathCountBygetPaymentConfirmation_By_CI;

	/**
	 * Returns all the sez status payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status payment confirmations
	 */
	@Override
	public List<SezStatusPaymentConfirmation>
		findBygetPaymentConfirmation_By_CI(String caseId) {

		return findBygetPaymentConfirmation_By_CI(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez status payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of sez status payment confirmations
	 * @param end the upper bound of the range of sez status payment confirmations (not inclusive)
	 * @return the range of matching sez status payment confirmations
	 */
	@Override
	public List<SezStatusPaymentConfirmation>
		findBygetPaymentConfirmation_By_CI(String caseId, int start, int end) {

		return findBygetPaymentConfirmation_By_CI(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez status payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of sez status payment confirmations
	 * @param end the upper bound of the range of sez status payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status payment confirmations
	 */
	@Override
	public List<SezStatusPaymentConfirmation>
		findBygetPaymentConfirmation_By_CI(
			String caseId, int start, int end,
			OrderByComparator<SezStatusPaymentConfirmation> orderByComparator) {

		return findBygetPaymentConfirmation_By_CI(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez status payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of sez status payment confirmations
	 * @param end the upper bound of the range of sez status payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status payment confirmations
	 */
	@Override
	public List<SezStatusPaymentConfirmation>
		findBygetPaymentConfirmation_By_CI(
			String caseId, int start, int end,
			OrderByComparator<SezStatusPaymentConfirmation> orderByComparator,
			boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetPaymentConfirmation_By_CI;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetPaymentConfirmation_By_CI;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<SezStatusPaymentConfirmation> list = null;

		if (useFinderCache) {
			list = (List<SezStatusPaymentConfirmation>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SezStatusPaymentConfirmation sezStatusPaymentConfirmation :
						list) {

					if (!caseId.equals(
							sezStatusPaymentConfirmation.getCaseId())) {

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

			sb.append(_SQL_SELECT_SEZSTATUSPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPAYMENTCONFIRMATION_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETPAYMENTCONFIRMATION_BY_CI_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SezStatusPaymentConfirmationModelImpl.ORDER_BY_JPQL);
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

				list = (List<SezStatusPaymentConfirmation>)QueryUtil.list(
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
	 * Returns the first sez status payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status payment confirmation
	 * @throws NoSuchSezStatusPaymentConfirmationException if a matching sez status payment confirmation could not be found
	 */
	@Override
	public SezStatusPaymentConfirmation
			findBygetPaymentConfirmation_By_CI_First(
				String caseId,
				OrderByComparator<SezStatusPaymentConfirmation>
					orderByComparator)
		throws NoSuchSezStatusPaymentConfirmationException {

		SezStatusPaymentConfirmation sezStatusPaymentConfirmation =
			fetchBygetPaymentConfirmation_By_CI_First(
				caseId, orderByComparator);

		if (sezStatusPaymentConfirmation != null) {
			return sezStatusPaymentConfirmation;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchSezStatusPaymentConfirmationException(sb.toString());
	}

	/**
	 * Returns the first sez status payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status payment confirmation, or <code>null</code> if a matching sez status payment confirmation could not be found
	 */
	@Override
	public SezStatusPaymentConfirmation
		fetchBygetPaymentConfirmation_By_CI_First(
			String caseId,
			OrderByComparator<SezStatusPaymentConfirmation> orderByComparator) {

		List<SezStatusPaymentConfirmation> list =
			findBygetPaymentConfirmation_By_CI(caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sez status payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status payment confirmation
	 * @throws NoSuchSezStatusPaymentConfirmationException if a matching sez status payment confirmation could not be found
	 */
	@Override
	public SezStatusPaymentConfirmation findBygetPaymentConfirmation_By_CI_Last(
			String caseId,
			OrderByComparator<SezStatusPaymentConfirmation> orderByComparator)
		throws NoSuchSezStatusPaymentConfirmationException {

		SezStatusPaymentConfirmation sezStatusPaymentConfirmation =
			fetchBygetPaymentConfirmation_By_CI_Last(caseId, orderByComparator);

		if (sezStatusPaymentConfirmation != null) {
			return sezStatusPaymentConfirmation;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchSezStatusPaymentConfirmationException(sb.toString());
	}

	/**
	 * Returns the last sez status payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status payment confirmation, or <code>null</code> if a matching sez status payment confirmation could not be found
	 */
	@Override
	public SezStatusPaymentConfirmation
		fetchBygetPaymentConfirmation_By_CI_Last(
			String caseId,
			OrderByComparator<SezStatusPaymentConfirmation> orderByComparator) {

		int count = countBygetPaymentConfirmation_By_CI(caseId);

		if (count == 0) {
			return null;
		}

		List<SezStatusPaymentConfirmation> list =
			findBygetPaymentConfirmation_By_CI(
				caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sez status payment confirmations before and after the current sez status payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param sezPaymentId the primary key of the current sez status payment confirmation
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status payment confirmation
	 * @throws NoSuchSezStatusPaymentConfirmationException if a sez status payment confirmation with the primary key could not be found
	 */
	@Override
	public SezStatusPaymentConfirmation[]
			findBygetPaymentConfirmation_By_CI_PrevAndNext(
				long sezPaymentId, String caseId,
				OrderByComparator<SezStatusPaymentConfirmation>
					orderByComparator)
		throws NoSuchSezStatusPaymentConfirmationException {

		caseId = Objects.toString(caseId, "");

		SezStatusPaymentConfirmation sezStatusPaymentConfirmation =
			findByPrimaryKey(sezPaymentId);

		Session session = null;

		try {
			session = openSession();

			SezStatusPaymentConfirmation[] array =
				new SezStatusPaymentConfirmationImpl[3];

			array[0] = getBygetPaymentConfirmation_By_CI_PrevAndNext(
				session, sezStatusPaymentConfirmation, caseId,
				orderByComparator, true);

			array[1] = sezStatusPaymentConfirmation;

			array[2] = getBygetPaymentConfirmation_By_CI_PrevAndNext(
				session, sezStatusPaymentConfirmation, caseId,
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

	protected SezStatusPaymentConfirmation
		getBygetPaymentConfirmation_By_CI_PrevAndNext(
			Session session,
			SezStatusPaymentConfirmation sezStatusPaymentConfirmation,
			String caseId,
			OrderByComparator<SezStatusPaymentConfirmation> orderByComparator,
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

		sb.append(_SQL_SELECT_SEZSTATUSPAYMENTCONFIRMATION_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETPAYMENTCONFIRMATION_BY_CI_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETPAYMENTCONFIRMATION_BY_CI_CASEID_2);
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
			sb.append(SezStatusPaymentConfirmationModelImpl.ORDER_BY_JPQL);
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
						sezStatusPaymentConfirmation)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SezStatusPaymentConfirmation> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sez status payment confirmations where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetPaymentConfirmation_By_CI(String caseId) {
		for (SezStatusPaymentConfirmation sezStatusPaymentConfirmation :
				findBygetPaymentConfirmation_By_CI(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(sezStatusPaymentConfirmation);
		}
	}

	/**
	 * Returns the number of sez status payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching sez status payment confirmations
	 */
	@Override
	public int countBygetPaymentConfirmation_By_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetPaymentConfirmation_By_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZSTATUSPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPAYMENTCONFIRMATION_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETPAYMENTCONFIRMATION_BY_CI_CASEID_2);
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
		_FINDER_COLUMN_GETPAYMENTCONFIRMATION_BY_CI_CASEID_2 =
			"sezStatusPaymentConfirmation.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETPAYMENTCONFIRMATION_BY_CI_CASEID_3 =
			"(sezStatusPaymentConfirmation.caseId IS NULL OR sezStatusPaymentConfirmation.caseId = '')";

	public SezStatusPaymentConfirmationPersistenceImpl() {
		setModelClass(SezStatusPaymentConfirmation.class);

		setModelImplClass(SezStatusPaymentConfirmationImpl.class);
		setModelPKClass(long.class);

		setTable(SezStatusPaymentConfirmationTable.INSTANCE);
	}

	/**
	 * Caches the sez status payment confirmation in the entity cache if it is enabled.
	 *
	 * @param sezStatusPaymentConfirmation the sez status payment confirmation
	 */
	@Override
	public void cacheResult(
		SezStatusPaymentConfirmation sezStatusPaymentConfirmation) {

		entityCache.putResult(
			SezStatusPaymentConfirmationImpl.class,
			sezStatusPaymentConfirmation.getPrimaryKey(),
			sezStatusPaymentConfirmation);

		finderCache.putResult(
			_finderPathFetchBygetPaymentConfirmationBy_CI,
			new Object[] {sezStatusPaymentConfirmation.getCaseId()},
			sezStatusPaymentConfirmation);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez status payment confirmations in the entity cache if it is enabled.
	 *
	 * @param sezStatusPaymentConfirmations the sez status payment confirmations
	 */
	@Override
	public void cacheResult(
		List<SezStatusPaymentConfirmation> sezStatusPaymentConfirmations) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezStatusPaymentConfirmations.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezStatusPaymentConfirmation sezStatusPaymentConfirmation :
				sezStatusPaymentConfirmations) {

			if (entityCache.getResult(
					SezStatusPaymentConfirmationImpl.class,
					sezStatusPaymentConfirmation.getPrimaryKey()) == null) {

				cacheResult(sezStatusPaymentConfirmation);
			}
		}
	}

	/**
	 * Clears the cache for all sez status payment confirmations.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezStatusPaymentConfirmationImpl.class);

		finderCache.clearCache(SezStatusPaymentConfirmationImpl.class);
	}

	/**
	 * Clears the cache for the sez status payment confirmation.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		SezStatusPaymentConfirmation sezStatusPaymentConfirmation) {

		entityCache.removeResult(
			SezStatusPaymentConfirmationImpl.class,
			sezStatusPaymentConfirmation);
	}

	@Override
	public void clearCache(
		List<SezStatusPaymentConfirmation> sezStatusPaymentConfirmations) {

		for (SezStatusPaymentConfirmation sezStatusPaymentConfirmation :
				sezStatusPaymentConfirmations) {

			entityCache.removeResult(
				SezStatusPaymentConfirmationImpl.class,
				sezStatusPaymentConfirmation);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezStatusPaymentConfirmationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				SezStatusPaymentConfirmationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		SezStatusPaymentConfirmationModelImpl
			sezStatusPaymentConfirmationModelImpl) {

		Object[] args = new Object[] {
			sezStatusPaymentConfirmationModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetPaymentConfirmationBy_CI, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetPaymentConfirmationBy_CI, args,
			sezStatusPaymentConfirmationModelImpl);
	}

	/**
	 * Creates a new sez status payment confirmation with the primary key. Does not add the sez status payment confirmation to the database.
	 *
	 * @param sezPaymentId the primary key for the new sez status payment confirmation
	 * @return the new sez status payment confirmation
	 */
	@Override
	public SezStatusPaymentConfirmation create(long sezPaymentId) {
		SezStatusPaymentConfirmation sezStatusPaymentConfirmation =
			new SezStatusPaymentConfirmationImpl();

		sezStatusPaymentConfirmation.setNew(true);
		sezStatusPaymentConfirmation.setPrimaryKey(sezPaymentId);

		sezStatusPaymentConfirmation.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return sezStatusPaymentConfirmation;
	}

	/**
	 * Removes the sez status payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezPaymentId the primary key of the sez status payment confirmation
	 * @return the sez status payment confirmation that was removed
	 * @throws NoSuchSezStatusPaymentConfirmationException if a sez status payment confirmation with the primary key could not be found
	 */
	@Override
	public SezStatusPaymentConfirmation remove(long sezPaymentId)
		throws NoSuchSezStatusPaymentConfirmationException {

		return remove((Serializable)sezPaymentId);
	}

	/**
	 * Removes the sez status payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez status payment confirmation
	 * @return the sez status payment confirmation that was removed
	 * @throws NoSuchSezStatusPaymentConfirmationException if a sez status payment confirmation with the primary key could not be found
	 */
	@Override
	public SezStatusPaymentConfirmation remove(Serializable primaryKey)
		throws NoSuchSezStatusPaymentConfirmationException {

		Session session = null;

		try {
			session = openSession();

			SezStatusPaymentConfirmation sezStatusPaymentConfirmation =
				(SezStatusPaymentConfirmation)session.get(
					SezStatusPaymentConfirmationImpl.class, primaryKey);

			if (sezStatusPaymentConfirmation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezStatusPaymentConfirmationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezStatusPaymentConfirmation);
		}
		catch (NoSuchSezStatusPaymentConfirmationException
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
	protected SezStatusPaymentConfirmation removeImpl(
		SezStatusPaymentConfirmation sezStatusPaymentConfirmation) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezStatusPaymentConfirmation)) {
				sezStatusPaymentConfirmation =
					(SezStatusPaymentConfirmation)session.get(
						SezStatusPaymentConfirmationImpl.class,
						sezStatusPaymentConfirmation.getPrimaryKeyObj());
			}

			if (sezStatusPaymentConfirmation != null) {
				session.delete(sezStatusPaymentConfirmation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezStatusPaymentConfirmation != null) {
			clearCache(sezStatusPaymentConfirmation);
		}

		return sezStatusPaymentConfirmation;
	}

	@Override
	public SezStatusPaymentConfirmation updateImpl(
		SezStatusPaymentConfirmation sezStatusPaymentConfirmation) {

		boolean isNew = sezStatusPaymentConfirmation.isNew();

		if (!(sezStatusPaymentConfirmation instanceof
				SezStatusPaymentConfirmationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					sezStatusPaymentConfirmation.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					sezStatusPaymentConfirmation);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezStatusPaymentConfirmation proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezStatusPaymentConfirmation implementation " +
					sezStatusPaymentConfirmation.getClass());
		}

		SezStatusPaymentConfirmationModelImpl
			sezStatusPaymentConfirmationModelImpl =
				(SezStatusPaymentConfirmationModelImpl)
					sezStatusPaymentConfirmation;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezStatusPaymentConfirmation.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezStatusPaymentConfirmation.setCreateDate(date);
			}
			else {
				sezStatusPaymentConfirmation.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezStatusPaymentConfirmationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezStatusPaymentConfirmation.setModifiedDate(date);
			}
			else {
				sezStatusPaymentConfirmation.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezStatusPaymentConfirmation);
			}
			else {
				sezStatusPaymentConfirmation =
					(SezStatusPaymentConfirmation)session.merge(
						sezStatusPaymentConfirmation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezStatusPaymentConfirmationImpl.class,
			sezStatusPaymentConfirmationModelImpl, false, true);

		cacheUniqueFindersCache(sezStatusPaymentConfirmationModelImpl);

		if (isNew) {
			sezStatusPaymentConfirmation.setNew(false);
		}

		sezStatusPaymentConfirmation.resetOriginalValues();

		return sezStatusPaymentConfirmation;
	}

	/**
	 * Returns the sez status payment confirmation with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez status payment confirmation
	 * @return the sez status payment confirmation
	 * @throws NoSuchSezStatusPaymentConfirmationException if a sez status payment confirmation with the primary key could not be found
	 */
	@Override
	public SezStatusPaymentConfirmation findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchSezStatusPaymentConfirmationException {

		SezStatusPaymentConfirmation sezStatusPaymentConfirmation =
			fetchByPrimaryKey(primaryKey);

		if (sezStatusPaymentConfirmation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezStatusPaymentConfirmationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezStatusPaymentConfirmation;
	}

	/**
	 * Returns the sez status payment confirmation with the primary key or throws a <code>NoSuchSezStatusPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param sezPaymentId the primary key of the sez status payment confirmation
	 * @return the sez status payment confirmation
	 * @throws NoSuchSezStatusPaymentConfirmationException if a sez status payment confirmation with the primary key could not be found
	 */
	@Override
	public SezStatusPaymentConfirmation findByPrimaryKey(long sezPaymentId)
		throws NoSuchSezStatusPaymentConfirmationException {

		return findByPrimaryKey((Serializable)sezPaymentId);
	}

	/**
	 * Returns the sez status payment confirmation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezPaymentId the primary key of the sez status payment confirmation
	 * @return the sez status payment confirmation, or <code>null</code> if a sez status payment confirmation with the primary key could not be found
	 */
	@Override
	public SezStatusPaymentConfirmation fetchByPrimaryKey(long sezPaymentId) {
		return fetchByPrimaryKey((Serializable)sezPaymentId);
	}

	/**
	 * Returns all the sez status payment confirmations.
	 *
	 * @return the sez status payment confirmations
	 */
	@Override
	public List<SezStatusPaymentConfirmation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez status payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status payment confirmations
	 * @param end the upper bound of the range of sez status payment confirmations (not inclusive)
	 * @return the range of sez status payment confirmations
	 */
	@Override
	public List<SezStatusPaymentConfirmation> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez status payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status payment confirmations
	 * @param end the upper bound of the range of sez status payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez status payment confirmations
	 */
	@Override
	public List<SezStatusPaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<SezStatusPaymentConfirmation> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez status payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status payment confirmations
	 * @param end the upper bound of the range of sez status payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez status payment confirmations
	 */
	@Override
	public List<SezStatusPaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<SezStatusPaymentConfirmation> orderByComparator,
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

		List<SezStatusPaymentConfirmation> list = null;

		if (useFinderCache) {
			list = (List<SezStatusPaymentConfirmation>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZSTATUSPAYMENTCONFIRMATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZSTATUSPAYMENTCONFIRMATION;

				sql = sql.concat(
					SezStatusPaymentConfirmationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezStatusPaymentConfirmation>)QueryUtil.list(
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
	 * Removes all the sez status payment confirmations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezStatusPaymentConfirmation sezStatusPaymentConfirmation :
				findAll()) {

			remove(sezStatusPaymentConfirmation);
		}
	}

	/**
	 * Returns the number of sez status payment confirmations.
	 *
	 * @return the number of sez status payment confirmations
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
					_SQL_COUNT_SEZSTATUSPAYMENTCONFIRMATION);

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
		return "sezPaymentId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZSTATUSPAYMENTCONFIRMATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezStatusPaymentConfirmationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez status payment confirmation persistence.
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

		_finderPathFetchBygetPaymentConfirmationBy_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetPaymentConfirmationBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetPaymentConfirmationBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetPaymentConfirmationBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetPaymentConfirmation_By_CI =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetPaymentConfirmation_By_CI",
				new String[] {
					String.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetPaymentConfirmation_By_CI =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetPaymentConfirmation_By_CI",
				new String[] {String.class.getName()}, new String[] {"caseId"},
				true);

		_finderPathCountBygetPaymentConfirmation_By_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetPaymentConfirmation_By_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		SezStatusPaymentConfirmationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezStatusPaymentConfirmationUtil.setPersistence(null);

		entityCache.removeCache(
			SezStatusPaymentConfirmationImpl.class.getName());
	}

	@Override
	@Reference(
		target = SEZ_STATUS_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = SEZ_STATUS_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = SEZ_STATUS_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_SEZSTATUSPAYMENTCONFIRMATION =
		"SELECT sezStatusPaymentConfirmation FROM SezStatusPaymentConfirmation sezStatusPaymentConfirmation";

	private static final String _SQL_SELECT_SEZSTATUSPAYMENTCONFIRMATION_WHERE =
		"SELECT sezStatusPaymentConfirmation FROM SezStatusPaymentConfirmation sezStatusPaymentConfirmation WHERE ";

	private static final String _SQL_COUNT_SEZSTATUSPAYMENTCONFIRMATION =
		"SELECT COUNT(sezStatusPaymentConfirmation) FROM SezStatusPaymentConfirmation sezStatusPaymentConfirmation";

	private static final String _SQL_COUNT_SEZSTATUSPAYMENTCONFIRMATION_WHERE =
		"SELECT COUNT(sezStatusPaymentConfirmation) FROM SezStatusPaymentConfirmation sezStatusPaymentConfirmation WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezStatusPaymentConfirmation.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezStatusPaymentConfirmation exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezStatusPaymentConfirmation exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezStatusPaymentConfirmationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}