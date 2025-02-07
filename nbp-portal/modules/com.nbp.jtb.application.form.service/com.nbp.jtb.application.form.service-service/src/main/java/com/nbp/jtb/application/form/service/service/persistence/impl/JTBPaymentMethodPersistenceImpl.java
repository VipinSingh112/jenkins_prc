/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence.impl;

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

import com.nbp.jtb.application.form.service.exception.NoSuchJTBPaymentMethodException;
import com.nbp.jtb.application.form.service.model.JTBPaymentMethod;
import com.nbp.jtb.application.form.service.model.JTBPaymentMethodTable;
import com.nbp.jtb.application.form.service.model.impl.JTBPaymentMethodImpl;
import com.nbp.jtb.application.form.service.model.impl.JTBPaymentMethodModelImpl;
import com.nbp.jtb.application.form.service.service.persistence.JTBPaymentMethodPersistence;
import com.nbp.jtb.application.form.service.service.persistence.JTBPaymentMethodUtil;
import com.nbp.jtb.application.form.service.service.persistence.impl.constants.JTB_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the jtb payment method service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = JTBPaymentMethodPersistence.class)
public class JTBPaymentMethodPersistenceImpl
	extends BasePersistenceImpl<JTBPaymentMethod>
	implements JTBPaymentMethodPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>JTBPaymentMethodUtil</code> to access the jtb payment method persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		JTBPaymentMethodImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetJTBById;
	private FinderPath _finderPathCountBygetJTBById;

	/**
	 * Returns the jtb payment method where jtbApplicationId = &#63; or throws a <code>NoSuchJTBPaymentMethodException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb payment method
	 * @throws NoSuchJTBPaymentMethodException if a matching jtb payment method could not be found
	 */
	@Override
	public JTBPaymentMethod findBygetJTBById(long jtbApplicationId)
		throws NoSuchJTBPaymentMethodException {

		JTBPaymentMethod jtbPaymentMethod = fetchBygetJTBById(jtbApplicationId);

		if (jtbPaymentMethod == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("jtbApplicationId=");
			sb.append(jtbApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchJTBPaymentMethodException(sb.toString());
		}

		return jtbPaymentMethod;
	}

	/**
	 * Returns the jtb payment method where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb payment method, or <code>null</code> if a matching jtb payment method could not be found
	 */
	@Override
	public JTBPaymentMethod fetchBygetJTBById(long jtbApplicationId) {
		return fetchBygetJTBById(jtbApplicationId, true);
	}

	/**
	 * Returns the jtb payment method where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb payment method, or <code>null</code> if a matching jtb payment method could not be found
	 */
	@Override
	public JTBPaymentMethod fetchBygetJTBById(
		long jtbApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {jtbApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJTBById, finderArgs, this);
		}

		if (result instanceof JTBPaymentMethod) {
			JTBPaymentMethod jtbPaymentMethod = (JTBPaymentMethod)result;

			if (jtbApplicationId != jtbPaymentMethod.getJtbApplicationId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_JTBPAYMENTMETHOD_WHERE);

			sb.append(_FINDER_COLUMN_GETJTBBYID_JTBAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

				List<JTBPaymentMethod> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJTBById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {jtbApplicationId};
							}

							_log.warn(
								"JTBPaymentMethodPersistenceImpl.fetchBygetJTBById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JTBPaymentMethod jtbPaymentMethod = list.get(0);

					result = jtbPaymentMethod;

					cacheResult(jtbPaymentMethod);
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
			return (JTBPaymentMethod)result;
		}
	}

	/**
	 * Removes the jtb payment method where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the jtb payment method that was removed
	 */
	@Override
	public JTBPaymentMethod removeBygetJTBById(long jtbApplicationId)
		throws NoSuchJTBPaymentMethodException {

		JTBPaymentMethod jtbPaymentMethod = findBygetJTBById(jtbApplicationId);

		return remove(jtbPaymentMethod);
	}

	/**
	 * Returns the number of jtb payment methods where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching jtb payment methods
	 */
	@Override
	public int countBygetJTBById(long jtbApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJTBById;

		Object[] finderArgs = new Object[] {jtbApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JTBPAYMENTMETHOD_WHERE);

			sb.append(_FINDER_COLUMN_GETJTBBYID_JTBAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

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

	private static final String _FINDER_COLUMN_GETJTBBYID_JTBAPPLICATIONID_2 =
		"jtbPaymentMethod.jtbApplicationId = ?";

	public JTBPaymentMethodPersistenceImpl() {
		setModelClass(JTBPaymentMethod.class);

		setModelImplClass(JTBPaymentMethodImpl.class);
		setModelPKClass(long.class);

		setTable(JTBPaymentMethodTable.INSTANCE);
	}

	/**
	 * Caches the jtb payment method in the entity cache if it is enabled.
	 *
	 * @param jtbPaymentMethod the jtb payment method
	 */
	@Override
	public void cacheResult(JTBPaymentMethod jtbPaymentMethod) {
		entityCache.putResult(
			JTBPaymentMethodImpl.class, jtbPaymentMethod.getPrimaryKey(),
			jtbPaymentMethod);

		finderCache.putResult(
			_finderPathFetchBygetJTBById,
			new Object[] {jtbPaymentMethod.getJtbApplicationId()},
			jtbPaymentMethod);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the jtb payment methods in the entity cache if it is enabled.
	 *
	 * @param jtbPaymentMethods the jtb payment methods
	 */
	@Override
	public void cacheResult(List<JTBPaymentMethod> jtbPaymentMethods) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (jtbPaymentMethods.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (JTBPaymentMethod jtbPaymentMethod : jtbPaymentMethods) {
			if (entityCache.getResult(
					JTBPaymentMethodImpl.class,
					jtbPaymentMethod.getPrimaryKey()) == null) {

				cacheResult(jtbPaymentMethod);
			}
		}
	}

	/**
	 * Clears the cache for all jtb payment methods.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(JTBPaymentMethodImpl.class);

		finderCache.clearCache(JTBPaymentMethodImpl.class);
	}

	/**
	 * Clears the cache for the jtb payment method.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(JTBPaymentMethod jtbPaymentMethod) {
		entityCache.removeResult(JTBPaymentMethodImpl.class, jtbPaymentMethod);
	}

	@Override
	public void clearCache(List<JTBPaymentMethod> jtbPaymentMethods) {
		for (JTBPaymentMethod jtbPaymentMethod : jtbPaymentMethods) {
			entityCache.removeResult(
				JTBPaymentMethodImpl.class, jtbPaymentMethod);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(JTBPaymentMethodImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(JTBPaymentMethodImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		JTBPaymentMethodModelImpl jtbPaymentMethodModelImpl) {

		Object[] args = new Object[] {
			jtbPaymentMethodModelImpl.getJtbApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetJTBById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJTBById, args, jtbPaymentMethodModelImpl);
	}

	/**
	 * Creates a new jtb payment method with the primary key. Does not add the jtb payment method to the database.
	 *
	 * @param jTBPaymentMethodId the primary key for the new jtb payment method
	 * @return the new jtb payment method
	 */
	@Override
	public JTBPaymentMethod create(long jTBPaymentMethodId) {
		JTBPaymentMethod jtbPaymentMethod = new JTBPaymentMethodImpl();

		jtbPaymentMethod.setNew(true);
		jtbPaymentMethod.setPrimaryKey(jTBPaymentMethodId);

		jtbPaymentMethod.setCompanyId(CompanyThreadLocal.getCompanyId());

		return jtbPaymentMethod;
	}

	/**
	 * Removes the jtb payment method with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jTBPaymentMethodId the primary key of the jtb payment method
	 * @return the jtb payment method that was removed
	 * @throws NoSuchJTBPaymentMethodException if a jtb payment method with the primary key could not be found
	 */
	@Override
	public JTBPaymentMethod remove(long jTBPaymentMethodId)
		throws NoSuchJTBPaymentMethodException {

		return remove((Serializable)jTBPaymentMethodId);
	}

	/**
	 * Removes the jtb payment method with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the jtb payment method
	 * @return the jtb payment method that was removed
	 * @throws NoSuchJTBPaymentMethodException if a jtb payment method with the primary key could not be found
	 */
	@Override
	public JTBPaymentMethod remove(Serializable primaryKey)
		throws NoSuchJTBPaymentMethodException {

		Session session = null;

		try {
			session = openSession();

			JTBPaymentMethod jtbPaymentMethod = (JTBPaymentMethod)session.get(
				JTBPaymentMethodImpl.class, primaryKey);

			if (jtbPaymentMethod == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJTBPaymentMethodException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(jtbPaymentMethod);
		}
		catch (NoSuchJTBPaymentMethodException noSuchEntityException) {
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
	protected JTBPaymentMethod removeImpl(JTBPaymentMethod jtbPaymentMethod) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(jtbPaymentMethod)) {
				jtbPaymentMethod = (JTBPaymentMethod)session.get(
					JTBPaymentMethodImpl.class,
					jtbPaymentMethod.getPrimaryKeyObj());
			}

			if (jtbPaymentMethod != null) {
				session.delete(jtbPaymentMethod);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (jtbPaymentMethod != null) {
			clearCache(jtbPaymentMethod);
		}

		return jtbPaymentMethod;
	}

	@Override
	public JTBPaymentMethod updateImpl(JTBPaymentMethod jtbPaymentMethod) {
		boolean isNew = jtbPaymentMethod.isNew();

		if (!(jtbPaymentMethod instanceof JTBPaymentMethodModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(jtbPaymentMethod.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					jtbPaymentMethod);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in jtbPaymentMethod proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom JTBPaymentMethod implementation " +
					jtbPaymentMethod.getClass());
		}

		JTBPaymentMethodModelImpl jtbPaymentMethodModelImpl =
			(JTBPaymentMethodModelImpl)jtbPaymentMethod;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (jtbPaymentMethod.getCreateDate() == null)) {
			if (serviceContext == null) {
				jtbPaymentMethod.setCreateDate(date);
			}
			else {
				jtbPaymentMethod.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!jtbPaymentMethodModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				jtbPaymentMethod.setModifiedDate(date);
			}
			else {
				jtbPaymentMethod.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(jtbPaymentMethod);
			}
			else {
				jtbPaymentMethod = (JTBPaymentMethod)session.merge(
					jtbPaymentMethod);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			JTBPaymentMethodImpl.class, jtbPaymentMethodModelImpl, false, true);

		cacheUniqueFindersCache(jtbPaymentMethodModelImpl);

		if (isNew) {
			jtbPaymentMethod.setNew(false);
		}

		jtbPaymentMethod.resetOriginalValues();

		return jtbPaymentMethod;
	}

	/**
	 * Returns the jtb payment method with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the jtb payment method
	 * @return the jtb payment method
	 * @throws NoSuchJTBPaymentMethodException if a jtb payment method with the primary key could not be found
	 */
	@Override
	public JTBPaymentMethod findByPrimaryKey(Serializable primaryKey)
		throws NoSuchJTBPaymentMethodException {

		JTBPaymentMethod jtbPaymentMethod = fetchByPrimaryKey(primaryKey);

		if (jtbPaymentMethod == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJTBPaymentMethodException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return jtbPaymentMethod;
	}

	/**
	 * Returns the jtb payment method with the primary key or throws a <code>NoSuchJTBPaymentMethodException</code> if it could not be found.
	 *
	 * @param jTBPaymentMethodId the primary key of the jtb payment method
	 * @return the jtb payment method
	 * @throws NoSuchJTBPaymentMethodException if a jtb payment method with the primary key could not be found
	 */
	@Override
	public JTBPaymentMethod findByPrimaryKey(long jTBPaymentMethodId)
		throws NoSuchJTBPaymentMethodException {

		return findByPrimaryKey((Serializable)jTBPaymentMethodId);
	}

	/**
	 * Returns the jtb payment method with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jTBPaymentMethodId the primary key of the jtb payment method
	 * @return the jtb payment method, or <code>null</code> if a jtb payment method with the primary key could not be found
	 */
	@Override
	public JTBPaymentMethod fetchByPrimaryKey(long jTBPaymentMethodId) {
		return fetchByPrimaryKey((Serializable)jTBPaymentMethodId);
	}

	/**
	 * Returns all the jtb payment methods.
	 *
	 * @return the jtb payment methods
	 */
	@Override
	public List<JTBPaymentMethod> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jtb payment methods.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBPaymentMethodModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb payment methods
	 * @param end the upper bound of the range of jtb payment methods (not inclusive)
	 * @return the range of jtb payment methods
	 */
	@Override
	public List<JTBPaymentMethod> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the jtb payment methods.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBPaymentMethodModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb payment methods
	 * @param end the upper bound of the range of jtb payment methods (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jtb payment methods
	 */
	@Override
	public List<JTBPaymentMethod> findAll(
		int start, int end,
		OrderByComparator<JTBPaymentMethod> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jtb payment methods.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBPaymentMethodModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb payment methods
	 * @param end the upper bound of the range of jtb payment methods (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jtb payment methods
	 */
	@Override
	public List<JTBPaymentMethod> findAll(
		int start, int end,
		OrderByComparator<JTBPaymentMethod> orderByComparator,
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

		List<JTBPaymentMethod> list = null;

		if (useFinderCache) {
			list = (List<JTBPaymentMethod>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_JTBPAYMENTMETHOD);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_JTBPAYMENTMETHOD;

				sql = sql.concat(JTBPaymentMethodModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<JTBPaymentMethod>)QueryUtil.list(
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
	 * Removes all the jtb payment methods from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (JTBPaymentMethod jtbPaymentMethod : findAll()) {
			remove(jtbPaymentMethod);
		}
	}

	/**
	 * Returns the number of jtb payment methods.
	 *
	 * @return the number of jtb payment methods
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_JTBPAYMENTMETHOD);

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
		return "jTBPaymentMethodId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_JTBPAYMENTMETHOD;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return JTBPaymentMethodModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the jtb payment method persistence.
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

		_finderPathFetchBygetJTBById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJTBById",
			new String[] {Long.class.getName()},
			new String[] {"jtbApplicationId"}, true);

		_finderPathCountBygetJTBById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetJTBById",
			new String[] {Long.class.getName()},
			new String[] {"jtbApplicationId"}, false);

		JTBPaymentMethodUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		JTBPaymentMethodUtil.setPersistence(null);

		entityCache.removeCache(JTBPaymentMethodImpl.class.getName());
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_JTBPAYMENTMETHOD =
		"SELECT jtbPaymentMethod FROM JTBPaymentMethod jtbPaymentMethod";

	private static final String _SQL_SELECT_JTBPAYMENTMETHOD_WHERE =
		"SELECT jtbPaymentMethod FROM JTBPaymentMethod jtbPaymentMethod WHERE ";

	private static final String _SQL_COUNT_JTBPAYMENTMETHOD =
		"SELECT COUNT(jtbPaymentMethod) FROM JTBPaymentMethod jtbPaymentMethod";

	private static final String _SQL_COUNT_JTBPAYMENTMETHOD_WHERE =
		"SELECT COUNT(jtbPaymentMethod) FROM JTBPaymentMethod jtbPaymentMethod WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "jtbPaymentMethod.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No JTBPaymentMethod exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No JTBPaymentMethod exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		JTBPaymentMethodPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}