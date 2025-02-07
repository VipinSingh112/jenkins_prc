/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence.impl;

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

import com.nbp.janaac.application.form.service.exception.NoSuchJanaacApplicationPaymentException;
import com.nbp.janaac.application.form.service.model.JanaacApplicationPayment;
import com.nbp.janaac.application.form.service.model.JanaacApplicationPaymentTable;
import com.nbp.janaac.application.form.service.model.impl.JanaacApplicationPaymentImpl;
import com.nbp.janaac.application.form.service.model.impl.JanaacApplicationPaymentModelImpl;
import com.nbp.janaac.application.form.service.service.persistence.JanaacApplicationPaymentPersistence;
import com.nbp.janaac.application.form.service.service.persistence.JanaacApplicationPaymentUtil;
import com.nbp.janaac.application.form.service.service.persistence.impl.constants.JANAAC_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the janaac application payment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = JanaacApplicationPaymentPersistence.class)
public class JanaacApplicationPaymentPersistenceImpl
	extends BasePersistenceImpl<JanaacApplicationPayment>
	implements JanaacApplicationPaymentPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>JanaacApplicationPaymentUtil</code> to access the janaac application payment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		JanaacApplicationPaymentImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetJanaacById;
	private FinderPath _finderPathCountBygetJanaacById;

	/**
	 * Returns the janaac application payment where janaacApplicationId = &#63; or throws a <code>NoSuchJanaacApplicationPaymentException</code> if it could not be found.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching janaac application payment
	 * @throws NoSuchJanaacApplicationPaymentException if a matching janaac application payment could not be found
	 */
	@Override
	public JanaacApplicationPayment findBygetJanaacById(
			long janaacApplicationId)
		throws NoSuchJanaacApplicationPaymentException {

		JanaacApplicationPayment janaacApplicationPayment =
			fetchBygetJanaacById(janaacApplicationId);

		if (janaacApplicationPayment == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("janaacApplicationId=");
			sb.append(janaacApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchJanaacApplicationPaymentException(sb.toString());
		}

		return janaacApplicationPayment;
	}

	/**
	 * Returns the janaac application payment where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching janaac application payment, or <code>null</code> if a matching janaac application payment could not be found
	 */
	@Override
	public JanaacApplicationPayment fetchBygetJanaacById(
		long janaacApplicationId) {

		return fetchBygetJanaacById(janaacApplicationId, true);
	}

	/**
	 * Returns the janaac application payment where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching janaac application payment, or <code>null</code> if a matching janaac application payment could not be found
	 */
	@Override
	public JanaacApplicationPayment fetchBygetJanaacById(
		long janaacApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {janaacApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJanaacById, finderArgs, this);
		}

		if (result instanceof JanaacApplicationPayment) {
			JanaacApplicationPayment janaacApplicationPayment =
				(JanaacApplicationPayment)result;

			if (janaacApplicationId !=
					janaacApplicationPayment.getJanaacApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_JANAACAPPLICATIONPAYMENT_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

				List<JanaacApplicationPayment> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJanaacById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {janaacApplicationId};
							}

							_log.warn(
								"JanaacApplicationPaymentPersistenceImpl.fetchBygetJanaacById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JanaacApplicationPayment janaacApplicationPayment =
						list.get(0);

					result = janaacApplicationPayment;

					cacheResult(janaacApplicationPayment);
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
			return (JanaacApplicationPayment)result;
		}
	}

	/**
	 * Removes the janaac application payment where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the janaac application payment that was removed
	 */
	@Override
	public JanaacApplicationPayment removeBygetJanaacById(
			long janaacApplicationId)
		throws NoSuchJanaacApplicationPaymentException {

		JanaacApplicationPayment janaacApplicationPayment = findBygetJanaacById(
			janaacApplicationId);

		return remove(janaacApplicationPayment);
	}

	/**
	 * Returns the number of janaac application payments where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching janaac application payments
	 */
	@Override
	public int countBygetJanaacById(long janaacApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJanaacById;

		Object[] finderArgs = new Object[] {janaacApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JANAACAPPLICATIONPAYMENT_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

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
		_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2 =
			"janaacApplicationPayment.janaacApplicationId = ?";

	public JanaacApplicationPaymentPersistenceImpl() {
		setModelClass(JanaacApplicationPayment.class);

		setModelImplClass(JanaacApplicationPaymentImpl.class);
		setModelPKClass(long.class);

		setTable(JanaacApplicationPaymentTable.INSTANCE);
	}

	/**
	 * Caches the janaac application payment in the entity cache if it is enabled.
	 *
	 * @param janaacApplicationPayment the janaac application payment
	 */
	@Override
	public void cacheResult(JanaacApplicationPayment janaacApplicationPayment) {
		entityCache.putResult(
			JanaacApplicationPaymentImpl.class,
			janaacApplicationPayment.getPrimaryKey(), janaacApplicationPayment);

		finderCache.putResult(
			_finderPathFetchBygetJanaacById,
			new Object[] {janaacApplicationPayment.getJanaacApplicationId()},
			janaacApplicationPayment);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the janaac application payments in the entity cache if it is enabled.
	 *
	 * @param janaacApplicationPayments the janaac application payments
	 */
	@Override
	public void cacheResult(
		List<JanaacApplicationPayment> janaacApplicationPayments) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (janaacApplicationPayments.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (JanaacApplicationPayment janaacApplicationPayment :
				janaacApplicationPayments) {

			if (entityCache.getResult(
					JanaacApplicationPaymentImpl.class,
					janaacApplicationPayment.getPrimaryKey()) == null) {

				cacheResult(janaacApplicationPayment);
			}
		}
	}

	/**
	 * Clears the cache for all janaac application payments.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(JanaacApplicationPaymentImpl.class);

		finderCache.clearCache(JanaacApplicationPaymentImpl.class);
	}

	/**
	 * Clears the cache for the janaac application payment.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(JanaacApplicationPayment janaacApplicationPayment) {
		entityCache.removeResult(
			JanaacApplicationPaymentImpl.class, janaacApplicationPayment);
	}

	@Override
	public void clearCache(
		List<JanaacApplicationPayment> janaacApplicationPayments) {

		for (JanaacApplicationPayment janaacApplicationPayment :
				janaacApplicationPayments) {

			entityCache.removeResult(
				JanaacApplicationPaymentImpl.class, janaacApplicationPayment);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(JanaacApplicationPaymentImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				JanaacApplicationPaymentImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		JanaacApplicationPaymentModelImpl janaacApplicationPaymentModelImpl) {

		Object[] args = new Object[] {
			janaacApplicationPaymentModelImpl.getJanaacApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetJanaacById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJanaacById, args,
			janaacApplicationPaymentModelImpl);
	}

	/**
	 * Creates a new janaac application payment with the primary key. Does not add the janaac application payment to the database.
	 *
	 * @param janaacApplicationPaymentId the primary key for the new janaac application payment
	 * @return the new janaac application payment
	 */
	@Override
	public JanaacApplicationPayment create(long janaacApplicationPaymentId) {
		JanaacApplicationPayment janaacApplicationPayment =
			new JanaacApplicationPaymentImpl();

		janaacApplicationPayment.setNew(true);
		janaacApplicationPayment.setPrimaryKey(janaacApplicationPaymentId);

		janaacApplicationPayment.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return janaacApplicationPayment;
	}

	/**
	 * Removes the janaac application payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param janaacApplicationPaymentId the primary key of the janaac application payment
	 * @return the janaac application payment that was removed
	 * @throws NoSuchJanaacApplicationPaymentException if a janaac application payment with the primary key could not be found
	 */
	@Override
	public JanaacApplicationPayment remove(long janaacApplicationPaymentId)
		throws NoSuchJanaacApplicationPaymentException {

		return remove((Serializable)janaacApplicationPaymentId);
	}

	/**
	 * Removes the janaac application payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the janaac application payment
	 * @return the janaac application payment that was removed
	 * @throws NoSuchJanaacApplicationPaymentException if a janaac application payment with the primary key could not be found
	 */
	@Override
	public JanaacApplicationPayment remove(Serializable primaryKey)
		throws NoSuchJanaacApplicationPaymentException {

		Session session = null;

		try {
			session = openSession();

			JanaacApplicationPayment janaacApplicationPayment =
				(JanaacApplicationPayment)session.get(
					JanaacApplicationPaymentImpl.class, primaryKey);

			if (janaacApplicationPayment == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJanaacApplicationPaymentException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(janaacApplicationPayment);
		}
		catch (NoSuchJanaacApplicationPaymentException noSuchEntityException) {
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
	protected JanaacApplicationPayment removeImpl(
		JanaacApplicationPayment janaacApplicationPayment) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(janaacApplicationPayment)) {
				janaacApplicationPayment =
					(JanaacApplicationPayment)session.get(
						JanaacApplicationPaymentImpl.class,
						janaacApplicationPayment.getPrimaryKeyObj());
			}

			if (janaacApplicationPayment != null) {
				session.delete(janaacApplicationPayment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (janaacApplicationPayment != null) {
			clearCache(janaacApplicationPayment);
		}

		return janaacApplicationPayment;
	}

	@Override
	public JanaacApplicationPayment updateImpl(
		JanaacApplicationPayment janaacApplicationPayment) {

		boolean isNew = janaacApplicationPayment.isNew();

		if (!(janaacApplicationPayment instanceof
				JanaacApplicationPaymentModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(janaacApplicationPayment.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					janaacApplicationPayment);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in janaacApplicationPayment proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom JanaacApplicationPayment implementation " +
					janaacApplicationPayment.getClass());
		}

		JanaacApplicationPaymentModelImpl janaacApplicationPaymentModelImpl =
			(JanaacApplicationPaymentModelImpl)janaacApplicationPayment;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (janaacApplicationPayment.getCreateDate() == null)) {
			if (serviceContext == null) {
				janaacApplicationPayment.setCreateDate(date);
			}
			else {
				janaacApplicationPayment.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!janaacApplicationPaymentModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				janaacApplicationPayment.setModifiedDate(date);
			}
			else {
				janaacApplicationPayment.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(janaacApplicationPayment);
			}
			else {
				janaacApplicationPayment =
					(JanaacApplicationPayment)session.merge(
						janaacApplicationPayment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			JanaacApplicationPaymentImpl.class,
			janaacApplicationPaymentModelImpl, false, true);

		cacheUniqueFindersCache(janaacApplicationPaymentModelImpl);

		if (isNew) {
			janaacApplicationPayment.setNew(false);
		}

		janaacApplicationPayment.resetOriginalValues();

		return janaacApplicationPayment;
	}

	/**
	 * Returns the janaac application payment with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the janaac application payment
	 * @return the janaac application payment
	 * @throws NoSuchJanaacApplicationPaymentException if a janaac application payment with the primary key could not be found
	 */
	@Override
	public JanaacApplicationPayment findByPrimaryKey(Serializable primaryKey)
		throws NoSuchJanaacApplicationPaymentException {

		JanaacApplicationPayment janaacApplicationPayment = fetchByPrimaryKey(
			primaryKey);

		if (janaacApplicationPayment == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJanaacApplicationPaymentException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return janaacApplicationPayment;
	}

	/**
	 * Returns the janaac application payment with the primary key or throws a <code>NoSuchJanaacApplicationPaymentException</code> if it could not be found.
	 *
	 * @param janaacApplicationPaymentId the primary key of the janaac application payment
	 * @return the janaac application payment
	 * @throws NoSuchJanaacApplicationPaymentException if a janaac application payment with the primary key could not be found
	 */
	@Override
	public JanaacApplicationPayment findByPrimaryKey(
			long janaacApplicationPaymentId)
		throws NoSuchJanaacApplicationPaymentException {

		return findByPrimaryKey((Serializable)janaacApplicationPaymentId);
	}

	/**
	 * Returns the janaac application payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param janaacApplicationPaymentId the primary key of the janaac application payment
	 * @return the janaac application payment, or <code>null</code> if a janaac application payment with the primary key could not be found
	 */
	@Override
	public JanaacApplicationPayment fetchByPrimaryKey(
		long janaacApplicationPaymentId) {

		return fetchByPrimaryKey((Serializable)janaacApplicationPaymentId);
	}

	/**
	 * Returns all the janaac application payments.
	 *
	 * @return the janaac application payments
	 */
	@Override
	public List<JanaacApplicationPayment> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the janaac application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac application payments
	 * @param end the upper bound of the range of janaac application payments (not inclusive)
	 * @return the range of janaac application payments
	 */
	@Override
	public List<JanaacApplicationPayment> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the janaac application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac application payments
	 * @param end the upper bound of the range of janaac application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of janaac application payments
	 */
	@Override
	public List<JanaacApplicationPayment> findAll(
		int start, int end,
		OrderByComparator<JanaacApplicationPayment> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the janaac application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac application payments
	 * @param end the upper bound of the range of janaac application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of janaac application payments
	 */
	@Override
	public List<JanaacApplicationPayment> findAll(
		int start, int end,
		OrderByComparator<JanaacApplicationPayment> orderByComparator,
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

		List<JanaacApplicationPayment> list = null;

		if (useFinderCache) {
			list = (List<JanaacApplicationPayment>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_JANAACAPPLICATIONPAYMENT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_JANAACAPPLICATIONPAYMENT;

				sql = sql.concat(
					JanaacApplicationPaymentModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<JanaacApplicationPayment>)QueryUtil.list(
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
	 * Removes all the janaac application payments from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (JanaacApplicationPayment janaacApplicationPayment : findAll()) {
			remove(janaacApplicationPayment);
		}
	}

	/**
	 * Returns the number of janaac application payments.
	 *
	 * @return the number of janaac application payments
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
					_SQL_COUNT_JANAACAPPLICATIONPAYMENT);

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
		return "janaacApplicationPaymentId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_JANAACAPPLICATIONPAYMENT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return JanaacApplicationPaymentModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the janaac application payment persistence.
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

		_finderPathFetchBygetJanaacById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJanaacById",
			new String[] {Long.class.getName()},
			new String[] {"janaacApplicationId"}, true);

		_finderPathCountBygetJanaacById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetJanaacById",
			new String[] {Long.class.getName()},
			new String[] {"janaacApplicationId"}, false);

		JanaacApplicationPaymentUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		JanaacApplicationPaymentUtil.setPersistence(null);

		entityCache.removeCache(JanaacApplicationPaymentImpl.class.getName());
	}

	@Override
	@Reference(
		target = JANAAC_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JANAAC_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JANAAC_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_JANAACAPPLICATIONPAYMENT =
		"SELECT janaacApplicationPayment FROM JanaacApplicationPayment janaacApplicationPayment";

	private static final String _SQL_SELECT_JANAACAPPLICATIONPAYMENT_WHERE =
		"SELECT janaacApplicationPayment FROM JanaacApplicationPayment janaacApplicationPayment WHERE ";

	private static final String _SQL_COUNT_JANAACAPPLICATIONPAYMENT =
		"SELECT COUNT(janaacApplicationPayment) FROM JanaacApplicationPayment janaacApplicationPayment";

	private static final String _SQL_COUNT_JANAACAPPLICATIONPAYMENT_WHERE =
		"SELECT COUNT(janaacApplicationPayment) FROM JanaacApplicationPayment janaacApplicationPayment WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"janaacApplicationPayment.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No JanaacApplicationPayment exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No JanaacApplicationPayment exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		JanaacApplicationPaymentPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}