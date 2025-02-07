/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service.persistence.impl;

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

import com.nbp.manufacturing.application.form.service.exception.NoSuchManuInternationalCertificateException;
import com.nbp.manufacturing.application.form.service.model.ManuInternationalCertificate;
import com.nbp.manufacturing.application.form.service.model.ManuInternationalCertificateTable;
import com.nbp.manufacturing.application.form.service.model.impl.ManuInternationalCertificateImpl;
import com.nbp.manufacturing.application.form.service.model.impl.ManuInternationalCertificateModelImpl;
import com.nbp.manufacturing.application.form.service.service.persistence.ManuInternationalCertificatePersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ManuInternationalCertificateUtil;
import com.nbp.manufacturing.application.form.service.service.persistence.impl.constants.MANUFACTURINGPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the manu international certificate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = ManuInternationalCertificatePersistence.class)
public class ManuInternationalCertificatePersistenceImpl
	extends BasePersistenceImpl<ManuInternationalCertificate>
	implements ManuInternationalCertificatePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ManuInternationalCertificateUtil</code> to access the manu international certificate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ManuInternationalCertificateImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetManufactureById;
	private FinderPath _finderPathCountBygetManufactureById;

	/**
	 * Returns the manu international certificate where manufacturingApplicationId = &#63; or throws a <code>NoSuchManuInternationalCertificateException</code> if it could not be found.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu international certificate
	 * @throws NoSuchManuInternationalCertificateException if a matching manu international certificate could not be found
	 */
	@Override
	public ManuInternationalCertificate findBygetManufactureById(
			long manufacturingApplicationId)
		throws NoSuchManuInternationalCertificateException {

		ManuInternationalCertificate manuInternationalCertificate =
			fetchBygetManufactureById(manufacturingApplicationId);

		if (manuInternationalCertificate == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("manufacturingApplicationId=");
			sb.append(manufacturingApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchManuInternationalCertificateException(
				sb.toString());
		}

		return manuInternationalCertificate;
	}

	/**
	 * Returns the manu international certificate where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu international certificate, or <code>null</code> if a matching manu international certificate could not be found
	 */
	@Override
	public ManuInternationalCertificate fetchBygetManufactureById(
		long manufacturingApplicationId) {

		return fetchBygetManufactureById(manufacturingApplicationId, true);
	}

	/**
	 * Returns the manu international certificate where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manu international certificate, or <code>null</code> if a matching manu international certificate could not be found
	 */
	@Override
	public ManuInternationalCertificate fetchBygetManufactureById(
		long manufacturingApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {manufacturingApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetManufactureById, finderArgs, this);
		}

		if (result instanceof ManuInternationalCertificate) {
			ManuInternationalCertificate manuInternationalCertificate =
				(ManuInternationalCertificate)result;

			if (manufacturingApplicationId !=
					manuInternationalCertificate.
						getManufacturingApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MANUINTERNATIONALCERTIFICATE_WHERE);

			sb.append(
				_FINDER_COLUMN_GETMANUFACTUREBYID_MANUFACTURINGAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manufacturingApplicationId);

				List<ManuInternationalCertificate> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetManufactureById, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									manufacturingApplicationId
								};
							}

							_log.warn(
								"ManuInternationalCertificatePersistenceImpl.fetchBygetManufactureById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					ManuInternationalCertificate manuInternationalCertificate =
						list.get(0);

					result = manuInternationalCertificate;

					cacheResult(manuInternationalCertificate);
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
			return (ManuInternationalCertificate)result;
		}
	}

	/**
	 * Removes the manu international certificate where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the manu international certificate that was removed
	 */
	@Override
	public ManuInternationalCertificate removeBygetManufactureById(
			long manufacturingApplicationId)
		throws NoSuchManuInternationalCertificateException {

		ManuInternationalCertificate manuInternationalCertificate =
			findBygetManufactureById(manufacturingApplicationId);

		return remove(manuInternationalCertificate);
	}

	/**
	 * Returns the number of manu international certificates where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu international certificates
	 */
	@Override
	public int countBygetManufactureById(long manufacturingApplicationId) {
		FinderPath finderPath = _finderPathCountBygetManufactureById;

		Object[] finderArgs = new Object[] {manufacturingApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MANUINTERNATIONALCERTIFICATE_WHERE);

			sb.append(
				_FINDER_COLUMN_GETMANUFACTUREBYID_MANUFACTURINGAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manufacturingApplicationId);

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
		_FINDER_COLUMN_GETMANUFACTUREBYID_MANUFACTURINGAPPLICATIONID_2 =
			"manuInternationalCertificate.manufacturingApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetMA_IC_MAI;
	private FinderPath _finderPathWithoutPaginationFindBygetMA_IC_MAI;
	private FinderPath _finderPathCountBygetMA_IC_MAI;

	/**
	 * Returns all the manu international certificates where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu international certificates
	 */
	@Override
	public List<ManuInternationalCertificate> findBygetMA_IC_MAI(
		long manufacturingApplicationId) {

		return findBygetMA_IC_MAI(
			manufacturingApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the manu international certificates where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInternationalCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu international certificates
	 * @param end the upper bound of the range of manu international certificates (not inclusive)
	 * @return the range of matching manu international certificates
	 */
	@Override
	public List<ManuInternationalCertificate> findBygetMA_IC_MAI(
		long manufacturingApplicationId, int start, int end) {

		return findBygetMA_IC_MAI(manufacturingApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the manu international certificates where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInternationalCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu international certificates
	 * @param end the upper bound of the range of manu international certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manu international certificates
	 */
	@Override
	public List<ManuInternationalCertificate> findBygetMA_IC_MAI(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<ManuInternationalCertificate> orderByComparator) {

		return findBygetMA_IC_MAI(
			manufacturingApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the manu international certificates where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInternationalCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu international certificates
	 * @param end the upper bound of the range of manu international certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manu international certificates
	 */
	@Override
	public List<ManuInternationalCertificate> findBygetMA_IC_MAI(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<ManuInternationalCertificate> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetMA_IC_MAI;
				finderArgs = new Object[] {manufacturingApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetMA_IC_MAI;
			finderArgs = new Object[] {
				manufacturingApplicationId, start, end, orderByComparator
			};
		}

		List<ManuInternationalCertificate> list = null;

		if (useFinderCache) {
			list = (List<ManuInternationalCertificate>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ManuInternationalCertificate manuInternationalCertificate :
						list) {

					if (manufacturingApplicationId !=
							manuInternationalCertificate.
								getManufacturingApplicationId()) {

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

			sb.append(_SQL_SELECT_MANUINTERNATIONALCERTIFICATE_WHERE);

			sb.append(_FINDER_COLUMN_GETMA_IC_MAI_MANUFACTURINGAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ManuInternationalCertificateModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manufacturingApplicationId);

				list = (List<ManuInternationalCertificate>)QueryUtil.list(
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
	 * Returns the first manu international certificate in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu international certificate
	 * @throws NoSuchManuInternationalCertificateException if a matching manu international certificate could not be found
	 */
	@Override
	public ManuInternationalCertificate findBygetMA_IC_MAI_First(
			long manufacturingApplicationId,
			OrderByComparator<ManuInternationalCertificate> orderByComparator)
		throws NoSuchManuInternationalCertificateException {

		ManuInternationalCertificate manuInternationalCertificate =
			fetchBygetMA_IC_MAI_First(
				manufacturingApplicationId, orderByComparator);

		if (manuInternationalCertificate != null) {
			return manuInternationalCertificate;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("manufacturingApplicationId=");
		sb.append(manufacturingApplicationId);

		sb.append("}");

		throw new NoSuchManuInternationalCertificateException(sb.toString());
	}

	/**
	 * Returns the first manu international certificate in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu international certificate, or <code>null</code> if a matching manu international certificate could not be found
	 */
	@Override
	public ManuInternationalCertificate fetchBygetMA_IC_MAI_First(
		long manufacturingApplicationId,
		OrderByComparator<ManuInternationalCertificate> orderByComparator) {

		List<ManuInternationalCertificate> list = findBygetMA_IC_MAI(
			manufacturingApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last manu international certificate in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu international certificate
	 * @throws NoSuchManuInternationalCertificateException if a matching manu international certificate could not be found
	 */
	@Override
	public ManuInternationalCertificate findBygetMA_IC_MAI_Last(
			long manufacturingApplicationId,
			OrderByComparator<ManuInternationalCertificate> orderByComparator)
		throws NoSuchManuInternationalCertificateException {

		ManuInternationalCertificate manuInternationalCertificate =
			fetchBygetMA_IC_MAI_Last(
				manufacturingApplicationId, orderByComparator);

		if (manuInternationalCertificate != null) {
			return manuInternationalCertificate;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("manufacturingApplicationId=");
		sb.append(manufacturingApplicationId);

		sb.append("}");

		throw new NoSuchManuInternationalCertificateException(sb.toString());
	}

	/**
	 * Returns the last manu international certificate in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu international certificate, or <code>null</code> if a matching manu international certificate could not be found
	 */
	@Override
	public ManuInternationalCertificate fetchBygetMA_IC_MAI_Last(
		long manufacturingApplicationId,
		OrderByComparator<ManuInternationalCertificate> orderByComparator) {

		int count = countBygetMA_IC_MAI(manufacturingApplicationId);

		if (count == 0) {
			return null;
		}

		List<ManuInternationalCertificate> list = findBygetMA_IC_MAI(
			manufacturingApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the manu international certificates before and after the current manu international certificate in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manuInternationalCertificateId the primary key of the current manu international certificate
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu international certificate
	 * @throws NoSuchManuInternationalCertificateException if a manu international certificate with the primary key could not be found
	 */
	@Override
	public ManuInternationalCertificate[] findBygetMA_IC_MAI_PrevAndNext(
			long manuInternationalCertificateId,
			long manufacturingApplicationId,
			OrderByComparator<ManuInternationalCertificate> orderByComparator)
		throws NoSuchManuInternationalCertificateException {

		ManuInternationalCertificate manuInternationalCertificate =
			findByPrimaryKey(manuInternationalCertificateId);

		Session session = null;

		try {
			session = openSession();

			ManuInternationalCertificate[] array =
				new ManuInternationalCertificateImpl[3];

			array[0] = getBygetMA_IC_MAI_PrevAndNext(
				session, manuInternationalCertificate,
				manufacturingApplicationId, orderByComparator, true);

			array[1] = manuInternationalCertificate;

			array[2] = getBygetMA_IC_MAI_PrevAndNext(
				session, manuInternationalCertificate,
				manufacturingApplicationId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected ManuInternationalCertificate getBygetMA_IC_MAI_PrevAndNext(
		Session session,
		ManuInternationalCertificate manuInternationalCertificate,
		long manufacturingApplicationId,
		OrderByComparator<ManuInternationalCertificate> orderByComparator,
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

		sb.append(_SQL_SELECT_MANUINTERNATIONALCERTIFICATE_WHERE);

		sb.append(_FINDER_COLUMN_GETMA_IC_MAI_MANUFACTURINGAPPLICATIONID_2);

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
			sb.append(ManuInternationalCertificateModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(manufacturingApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						manuInternationalCertificate)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ManuInternationalCertificate> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the manu international certificates where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 */
	@Override
	public void removeBygetMA_IC_MAI(long manufacturingApplicationId) {
		for (ManuInternationalCertificate manuInternationalCertificate :
				findBygetMA_IC_MAI(
					manufacturingApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(manuInternationalCertificate);
		}
	}

	/**
	 * Returns the number of manu international certificates where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu international certificates
	 */
	@Override
	public int countBygetMA_IC_MAI(long manufacturingApplicationId) {
		FinderPath finderPath = _finderPathCountBygetMA_IC_MAI;

		Object[] finderArgs = new Object[] {manufacturingApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MANUINTERNATIONALCERTIFICATE_WHERE);

			sb.append(_FINDER_COLUMN_GETMA_IC_MAI_MANUFACTURINGAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manufacturingApplicationId);

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
		_FINDER_COLUMN_GETMA_IC_MAI_MANUFACTURINGAPPLICATIONID_2 =
			"manuInternationalCertificate.manufacturingApplicationId = ?";

	public ManuInternationalCertificatePersistenceImpl() {
		setModelClass(ManuInternationalCertificate.class);

		setModelImplClass(ManuInternationalCertificateImpl.class);
		setModelPKClass(long.class);

		setTable(ManuInternationalCertificateTable.INSTANCE);
	}

	/**
	 * Caches the manu international certificate in the entity cache if it is enabled.
	 *
	 * @param manuInternationalCertificate the manu international certificate
	 */
	@Override
	public void cacheResult(
		ManuInternationalCertificate manuInternationalCertificate) {

		entityCache.putResult(
			ManuInternationalCertificateImpl.class,
			manuInternationalCertificate.getPrimaryKey(),
			manuInternationalCertificate);

		finderCache.putResult(
			_finderPathFetchBygetManufactureById,
			new Object[] {
				manuInternationalCertificate.getManufacturingApplicationId()
			},
			manuInternationalCertificate);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the manu international certificates in the entity cache if it is enabled.
	 *
	 * @param manuInternationalCertificates the manu international certificates
	 */
	@Override
	public void cacheResult(
		List<ManuInternationalCertificate> manuInternationalCertificates) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (manuInternationalCertificates.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (ManuInternationalCertificate manuInternationalCertificate :
				manuInternationalCertificates) {

			if (entityCache.getResult(
					ManuInternationalCertificateImpl.class,
					manuInternationalCertificate.getPrimaryKey()) == null) {

				cacheResult(manuInternationalCertificate);
			}
		}
	}

	/**
	 * Clears the cache for all manu international certificates.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ManuInternationalCertificateImpl.class);

		finderCache.clearCache(ManuInternationalCertificateImpl.class);
	}

	/**
	 * Clears the cache for the manu international certificate.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		ManuInternationalCertificate manuInternationalCertificate) {

		entityCache.removeResult(
			ManuInternationalCertificateImpl.class,
			manuInternationalCertificate);
	}

	@Override
	public void clearCache(
		List<ManuInternationalCertificate> manuInternationalCertificates) {

		for (ManuInternationalCertificate manuInternationalCertificate :
				manuInternationalCertificates) {

			entityCache.removeResult(
				ManuInternationalCertificateImpl.class,
				manuInternationalCertificate);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(ManuInternationalCertificateImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				ManuInternationalCertificateImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		ManuInternationalCertificateModelImpl
			manuInternationalCertificateModelImpl) {

		Object[] args = new Object[] {
			manuInternationalCertificateModelImpl.
				getManufacturingApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetManufactureById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetManufactureById, args,
			manuInternationalCertificateModelImpl);
	}

	/**
	 * Creates a new manu international certificate with the primary key. Does not add the manu international certificate to the database.
	 *
	 * @param manuInternationalCertificateId the primary key for the new manu international certificate
	 * @return the new manu international certificate
	 */
	@Override
	public ManuInternationalCertificate create(
		long manuInternationalCertificateId) {

		ManuInternationalCertificate manuInternationalCertificate =
			new ManuInternationalCertificateImpl();

		manuInternationalCertificate.setNew(true);
		manuInternationalCertificate.setPrimaryKey(
			manuInternationalCertificateId);

		manuInternationalCertificate.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return manuInternationalCertificate;
	}

	/**
	 * Removes the manu international certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manuInternationalCertificateId the primary key of the manu international certificate
	 * @return the manu international certificate that was removed
	 * @throws NoSuchManuInternationalCertificateException if a manu international certificate with the primary key could not be found
	 */
	@Override
	public ManuInternationalCertificate remove(
			long manuInternationalCertificateId)
		throws NoSuchManuInternationalCertificateException {

		return remove((Serializable)manuInternationalCertificateId);
	}

	/**
	 * Removes the manu international certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the manu international certificate
	 * @return the manu international certificate that was removed
	 * @throws NoSuchManuInternationalCertificateException if a manu international certificate with the primary key could not be found
	 */
	@Override
	public ManuInternationalCertificate remove(Serializable primaryKey)
		throws NoSuchManuInternationalCertificateException {

		Session session = null;

		try {
			session = openSession();

			ManuInternationalCertificate manuInternationalCertificate =
				(ManuInternationalCertificate)session.get(
					ManuInternationalCertificateImpl.class, primaryKey);

			if (manuInternationalCertificate == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchManuInternationalCertificateException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(manuInternationalCertificate);
		}
		catch (NoSuchManuInternationalCertificateException
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
	protected ManuInternationalCertificate removeImpl(
		ManuInternationalCertificate manuInternationalCertificate) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(manuInternationalCertificate)) {
				manuInternationalCertificate =
					(ManuInternationalCertificate)session.get(
						ManuInternationalCertificateImpl.class,
						manuInternationalCertificate.getPrimaryKeyObj());
			}

			if (manuInternationalCertificate != null) {
				session.delete(manuInternationalCertificate);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (manuInternationalCertificate != null) {
			clearCache(manuInternationalCertificate);
		}

		return manuInternationalCertificate;
	}

	@Override
	public ManuInternationalCertificate updateImpl(
		ManuInternationalCertificate manuInternationalCertificate) {

		boolean isNew = manuInternationalCertificate.isNew();

		if (!(manuInternationalCertificate instanceof
				ManuInternationalCertificateModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					manuInternationalCertificate.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					manuInternationalCertificate);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in manuInternationalCertificate proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom ManuInternationalCertificate implementation " +
					manuInternationalCertificate.getClass());
		}

		ManuInternationalCertificateModelImpl
			manuInternationalCertificateModelImpl =
				(ManuInternationalCertificateModelImpl)
					manuInternationalCertificate;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (manuInternationalCertificate.getCreateDate() == null)) {
			if (serviceContext == null) {
				manuInternationalCertificate.setCreateDate(date);
			}
			else {
				manuInternationalCertificate.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!manuInternationalCertificateModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				manuInternationalCertificate.setModifiedDate(date);
			}
			else {
				manuInternationalCertificate.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(manuInternationalCertificate);
			}
			else {
				manuInternationalCertificate =
					(ManuInternationalCertificate)session.merge(
						manuInternationalCertificate);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			ManuInternationalCertificateImpl.class,
			manuInternationalCertificateModelImpl, false, true);

		cacheUniqueFindersCache(manuInternationalCertificateModelImpl);

		if (isNew) {
			manuInternationalCertificate.setNew(false);
		}

		manuInternationalCertificate.resetOriginalValues();

		return manuInternationalCertificate;
	}

	/**
	 * Returns the manu international certificate with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the manu international certificate
	 * @return the manu international certificate
	 * @throws NoSuchManuInternationalCertificateException if a manu international certificate with the primary key could not be found
	 */
	@Override
	public ManuInternationalCertificate findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchManuInternationalCertificateException {

		ManuInternationalCertificate manuInternationalCertificate =
			fetchByPrimaryKey(primaryKey);

		if (manuInternationalCertificate == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchManuInternationalCertificateException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return manuInternationalCertificate;
	}

	/**
	 * Returns the manu international certificate with the primary key or throws a <code>NoSuchManuInternationalCertificateException</code> if it could not be found.
	 *
	 * @param manuInternationalCertificateId the primary key of the manu international certificate
	 * @return the manu international certificate
	 * @throws NoSuchManuInternationalCertificateException if a manu international certificate with the primary key could not be found
	 */
	@Override
	public ManuInternationalCertificate findByPrimaryKey(
			long manuInternationalCertificateId)
		throws NoSuchManuInternationalCertificateException {

		return findByPrimaryKey((Serializable)manuInternationalCertificateId);
	}

	/**
	 * Returns the manu international certificate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param manuInternationalCertificateId the primary key of the manu international certificate
	 * @return the manu international certificate, or <code>null</code> if a manu international certificate with the primary key could not be found
	 */
	@Override
	public ManuInternationalCertificate fetchByPrimaryKey(
		long manuInternationalCertificateId) {

		return fetchByPrimaryKey((Serializable)manuInternationalCertificateId);
	}

	/**
	 * Returns all the manu international certificates.
	 *
	 * @return the manu international certificates
	 */
	@Override
	public List<ManuInternationalCertificate> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the manu international certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInternationalCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu international certificates
	 * @param end the upper bound of the range of manu international certificates (not inclusive)
	 * @return the range of manu international certificates
	 */
	@Override
	public List<ManuInternationalCertificate> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the manu international certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInternationalCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu international certificates
	 * @param end the upper bound of the range of manu international certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of manu international certificates
	 */
	@Override
	public List<ManuInternationalCertificate> findAll(
		int start, int end,
		OrderByComparator<ManuInternationalCertificate> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the manu international certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInternationalCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu international certificates
	 * @param end the upper bound of the range of manu international certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of manu international certificates
	 */
	@Override
	public List<ManuInternationalCertificate> findAll(
		int start, int end,
		OrderByComparator<ManuInternationalCertificate> orderByComparator,
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

		List<ManuInternationalCertificate> list = null;

		if (useFinderCache) {
			list = (List<ManuInternationalCertificate>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MANUINTERNATIONALCERTIFICATE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MANUINTERNATIONALCERTIFICATE;

				sql = sql.concat(
					ManuInternationalCertificateModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<ManuInternationalCertificate>)QueryUtil.list(
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
	 * Removes all the manu international certificates from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ManuInternationalCertificate manuInternationalCertificate :
				findAll()) {

			remove(manuInternationalCertificate);
		}
	}

	/**
	 * Returns the number of manu international certificates.
	 *
	 * @return the number of manu international certificates
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
					_SQL_COUNT_MANUINTERNATIONALCERTIFICATE);

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
		return "manuInternationalCertificateId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MANUINTERNATIONALCERTIFICATE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ManuInternationalCertificateModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the manu international certificate persistence.
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

		_finderPathFetchBygetManufactureById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetManufactureById",
			new String[] {Long.class.getName()},
			new String[] {"manufacturingApplicationId"}, true);

		_finderPathCountBygetManufactureById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetManufactureById", new String[] {Long.class.getName()},
			new String[] {"manufacturingApplicationId"}, false);

		_finderPathWithPaginationFindBygetMA_IC_MAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetMA_IC_MAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"manufacturingApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetMA_IC_MAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetMA_IC_MAI",
			new String[] {Long.class.getName()},
			new String[] {"manufacturingApplicationId"}, true);

		_finderPathCountBygetMA_IC_MAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetMA_IC_MAI",
			new String[] {Long.class.getName()},
			new String[] {"manufacturingApplicationId"}, false);

		ManuInternationalCertificateUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		ManuInternationalCertificateUtil.setPersistence(null);

		entityCache.removeCache(
			ManuInternationalCertificateImpl.class.getName());
	}

	@Override
	@Reference(
		target = MANUFACTURINGPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = MANUFACTURINGPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = MANUFACTURINGPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_MANUINTERNATIONALCERTIFICATE =
		"SELECT manuInternationalCertificate FROM ManuInternationalCertificate manuInternationalCertificate";

	private static final String _SQL_SELECT_MANUINTERNATIONALCERTIFICATE_WHERE =
		"SELECT manuInternationalCertificate FROM ManuInternationalCertificate manuInternationalCertificate WHERE ";

	private static final String _SQL_COUNT_MANUINTERNATIONALCERTIFICATE =
		"SELECT COUNT(manuInternationalCertificate) FROM ManuInternationalCertificate manuInternationalCertificate";

	private static final String _SQL_COUNT_MANUINTERNATIONALCERTIFICATE_WHERE =
		"SELECT COUNT(manuInternationalCertificate) FROM ManuInternationalCertificate manuInternationalCertificate WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"manuInternationalCertificate.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No ManuInternationalCertificate exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No ManuInternationalCertificate exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ManuInternationalCertificatePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}